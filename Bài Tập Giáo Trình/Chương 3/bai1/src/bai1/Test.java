package bai1;

public class Test {
	public static void main(String[] args) {
		//tao doi tuong person bang ham tao khong doi
	 Person nguoi1= new Person();
	 	//kiem tra setter
	 nguoi1.setName("trang");
	 nguoi1.setDob("25/11/2005");
	 nguoi1.setPob("Hung Yen");
	 nguoi1.setGender('f');
	 nguoi1.setEmail("trang@gmail.com");
	 nguoi1.setPhone("012345834");
	 	//kiem tra getter
	 System.out.println("Name: " + nguoi1.getName());
     System.out.println("Dob: " + nguoi1.getDob());
     System.out.println("Pob: " + nguoi1.getPob());
     System.out.println("Gender: " + nguoi1.getGender());
     System.out.println("Email:"+nguoi1.getEmail());
     System.out.println("Phone:"+nguoi1.getPhone());
     	//tao doi tuong person bang ham tao co doi
     Person nguoi2= new Person("Vung", "03/05/2004", "Nghe An", 'm', "vung0305@gmail.com", "02358625474");
     	//kiem tra to string
     System.out.println("Thong tin nguoi 2:"+ nguoi2.toString());
}}
