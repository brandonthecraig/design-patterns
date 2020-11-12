package com.coffeepoweredcrew.proxy;

import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {

		Image img = ImageFactory.getImage("A1.bmp");

		img.setLocation(new Point2D(10, 10));
		System.out.println(img.getLocation());

		img.render();
		
	}

}
