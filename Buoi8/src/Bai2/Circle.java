package Bai2;

public class Circle implements IShape{
	private double radius;

	@Override
	public double getArea() {
		return 2*radius*3.14;
	}

	@Override
	public double getPerimeter() {
		return 3.14*radius*radius;
	}
	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	
}
