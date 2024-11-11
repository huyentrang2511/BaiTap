package bai8;

abstract public class Shape {
protected String color;
//ham tao
public Shape() {
	
}
public Shape(String color) {
	this.color=color;
}
//phuong thuc truu tuong
public abstract double getArea();
//getter va setter
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
//toString
@Override
public String toString() {
	return "Shape [color=" + color + "]";
}
//nhapthongtin
public abstract void inputData();
}
