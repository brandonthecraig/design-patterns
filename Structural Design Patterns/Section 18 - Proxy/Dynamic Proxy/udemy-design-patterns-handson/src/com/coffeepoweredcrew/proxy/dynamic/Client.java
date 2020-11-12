package com.coffeepoweredcrew.proxy.dynamic;

import com.coffeepoweredcrew.proxy.Image;
import javafx.geometry.Point2D;

public class Client {

	public static void main(String[] args) {

		Image img = ImageFactory.getImage();
		img.setLocation(new Point2D(18, 5));

	}
}
