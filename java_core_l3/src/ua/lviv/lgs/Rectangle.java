package ua.lviv.lgs;

public class Rectangle {

	private double length;
	private double width;

	Rectangle() {
		this.length = 5;
		this.width = 10;
	}

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double rectangleArea() {
		return (this.length * this.width);
	}

	public double rectanglePerimeter() {
		return (2 * (this.length + this.width));
	}
}
