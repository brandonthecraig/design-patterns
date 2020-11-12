package com.coffeepoweredcrew.prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		// shallow or deep copy? only property here is a property called position. Point3D is immutable which means we can do a shallow copy

		// clones and casts because clone method is coming from Object class
		GameUnit unit = (GameUnit)super.clone();
		// resets position
		unit.initialize();
		return unit;
	}

	protected void initialize() {
		this.position = Point3D.ZERO;
		// reset here to cover state
		reset();
	}

	protected abstract void reset();

	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}
}
