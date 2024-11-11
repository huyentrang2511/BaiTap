package bai7;

public class ResizableCircle extends Circle implements Resizable {
//ham tao
	public ResizableCircle(double radius) {
	super(radius);
}
//thayDoiKichThuoc
	public void resize(int percent) {
		radius*=(1+percent/100.0);
	}
//hienthi
	public String toString() {
        return "ResizableCircle with radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
