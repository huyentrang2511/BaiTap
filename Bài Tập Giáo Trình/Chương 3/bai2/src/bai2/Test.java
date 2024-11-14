package bai2;

public class Test {
	public static void main(String[] args) {
		//tao doi tuong person bang ham tao khong doi
	 DiaChi diaChi1= new DiaChi();
	 	//kiem tra setter
	 diaChi1.setThon("Ta Trung");
	 diaChi1.setXa("Chinh Nghia");
	 diaChi1.setHuyen("Kim Dong");
	 diaChi1.setTinh("Hung Yen");
	 	//kiem tra getter
	 System.out.println("Thon: " + diaChi1.getThon());
     System.out.println("Dob: " + diaChi1.getXa());
     System.out.println("Pob: " + diaChi1.getHuyen());
     System.out.println("Gender: " + diaChi1.getTinh());
     	//tao doi tuong person bang ham tao co doi
     DiaChi diaChi2= new DiaChi("Xom 5", "Tan Son", "Do Luonh", "Nghe An");
     	//kiem tra to string
     System.out.println("DiaChi 2:"+ diaChi2.toString());
	}
}
