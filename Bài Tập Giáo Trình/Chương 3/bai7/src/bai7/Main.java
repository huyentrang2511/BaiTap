package bai7;

public class Main {
	public static void main(String[] args) {
		Circle hinhtron=new Circle(5.0);
		System.out.println(hinhtron.toString());
		ResizableCircle r1=new ResizableCircle(5.0);
		System.out.println(r1.toString());
		r1.resize(50);
		System.out.println("After resizing by 50%:");
        System.out.println(r1.toString());
	}
}
