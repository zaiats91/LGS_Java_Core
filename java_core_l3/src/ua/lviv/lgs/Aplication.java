package ua.lviv.lgs;

public class Aplication {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4, 5);

		System.out.println("Периметир 1го прямокутника = " + r1.rectanglePerimeter());
		System.out.println("Площа 1го прямокутника = " + r1.rectangleArea());
		System.out.println("Периметир 2го прямокутника = " + r2.rectanglePerimeter());
		System.out.println("Площа 2го прямокутника = " + r2.rectangleArea());

		Circle c = new Circle(3, 6);

		System.out.println("Довжина кола = " + c.circleLength());
		System.out.println("Площа кола = " + c.circleArea());

	}

}
