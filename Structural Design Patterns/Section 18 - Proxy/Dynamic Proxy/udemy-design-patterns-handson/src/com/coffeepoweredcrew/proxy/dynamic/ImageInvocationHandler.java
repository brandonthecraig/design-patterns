package com.coffeepoweredcrew.proxy.dynamic;

import com.coffeepoweredcrew.proxy.Image;
import javafx.geometry.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//Implement invocation handler. Your "proxy" code goes here.
public class ImageInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // you do this for basically all objects and tell it how to respond to each

        Method setLocationMethod = Image.class.getMethod("setLocation", Point2D.class);
        if(setLocationMethod.equals(method)) {
            Point2D point2D = (Point2D)args[0];
            System.out.println(point2D);
        }

        return null;
    }
}
