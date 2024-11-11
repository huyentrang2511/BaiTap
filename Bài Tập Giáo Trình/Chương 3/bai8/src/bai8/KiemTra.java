package bai8;

public class KiemTra {
	public static void main(String []args) {
		//ktra hcn
		Rectangle hcn= new Rectangle();
		hcn.inputData();
		hcn.getArea();
		System.out.println(hcn.toString());
		//ktra hinh tam giac
		Triangle tgiac=new Triangle();
		tgiac.inputData();
		tgiac.getArea();
		System.out.println(tgiac.toString());
	}
}
