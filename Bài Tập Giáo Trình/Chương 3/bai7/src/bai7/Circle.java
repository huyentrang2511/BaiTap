package bai7;

public class Circle implements GeometricObject{
protected double radius=1.0;
//hamtao
public Circle() {
}
public Circle(double radius) {
	this.radius=radius;
}
//tinhChuvi
@Override
public double getPerimeter() {
	return 2*Math.PI*radius;
}
//tinh dien tich
@Override
public double getArea() {
	return Math.PI*radius*radius;
}
//hienthi
@Override
public String toString() {
    return "Circle with radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
}
}
