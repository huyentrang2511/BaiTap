package bai6;
import java.util.Scanner;
public class Employee extends Person {
protected int empID;
protected int maBH;
//hamtao
public Employee() {
	super();
}
public Employee(String name,  int age, char gender, int empID, int maBH) {
	super(name, age, gender);
	this.empID=empID;
	this.maBH=maBH;
}
//setter and getter
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public int getMaBH() {
	return maBH;
}
public void setMaBH(int maBH) {
	this.maBH = maBH;
}
//nhapthongtin
public void input() {
	Scanner input = new Scanner(System.in);
	int m;
	//dieukiencua so cong nhan
	do {
		System.out.println("Nhap so employee:");
		m= input.nextInt();
	}while(m<=2||m>=5);
	//nhap thong tin cua cong nhan
	Employee [] employees = new Employee[m];
	for(int i=0; i<m; i++) {
		System.out.println("dien thong tin cho cong nhan" + (i+1));
		//tao 1 doi tuong employee moi tai vi tri i trong mang
		employees[i]= new Employee();
		System.out.println("dien ma cong nhan:");
		employees[i].empID=input.nextInt();
		System.out.println("dien ma bao hiem:");
		employees[i].maBH=input.nextInt();
		super.input();
		System.out.println(employees[i].toString());
	}
}
//hien thi thong tin 
@Override
public String toString() {
	super.toString();
	return "Employee [empID=" + empID + ", maBH=" + maBH + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}

}
