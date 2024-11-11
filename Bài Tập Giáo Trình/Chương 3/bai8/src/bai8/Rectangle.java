package bai8;
import java.util.Scanner;
class Rectangle extends Shape{
protected int length;
protected int width;
//hamtao
public Rectangle() {
	super();
}
public Rectangle(String color, int length, int width) {
	super(color);
	this.length=length;
	this.width=width;
}
//tinhdientich
@Override
public double getArea() {
	double area= length*width;
	return area;
}
//nhapthongtin
public void inputData(){
	Scanner scanner=new Scanner(System.in);
	System.out.print("nhap chieu dai:");
	length=scanner.nextInt();
	System.out.print("nhap chieu rong:");
	width=scanner.nextInt();
}
//hienthi
@Override
public String toString() {
	return "Rectangle: "  + ", Length: " + length + ", Width: " + width + ", Area: " + getArea();
}


}
