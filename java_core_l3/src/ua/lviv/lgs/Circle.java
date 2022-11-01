package ua.lviv.lgs;

public class Circle {

	private double radius;
	private double diameter;

	Circle(double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}

	public double circleLength() {
		return (this.diameter * 3.14);
	}

	public double circleArea() {
		return (3.14 * Math.sqrt(this.radius));
	}

}
