package com.coffeepoweredcrew.proxy;

import javafx.geometry.Point2D;

import java.util.Objects;

//Proxy class.
public class ImageProxy implements Image {

    private BitmapImage image;
    private String fileName;
    private Point2D location;

    public ImageProxy(String name) {
        this.fileName = name;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (Objects.nonNull(image)) {
            image.setLocation(point2d);
        } else {
            location = point2d;
        }
    }

    @Override
    public Point2D getLocation() {
        if (Objects.nonNull(image)) {
            return image.getLocation();
        } else {
            return location;
        }
    }

    @Override
    public void render() {
        if (Objects.nonNull(image)) {
            image.render();
        } else {
            image = new BitmapImage(fileName);
            if (Objects.nonNull(location)) {
                image.setLocation(location);
            }
            image.render();
        }
    }
}
