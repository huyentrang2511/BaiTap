package bai6;
import java.util.Scanner;
public class PartTimeEmployee extends Employee{
protected int hoursPerWeek;
protected int salaryID;
//ham tao
public PartTimeEmployee() {
	super();
}
public PartTimeEmployee(String name, int age, char gender, int empID, int maBH, int hoursPerWeek, int salaryID) {
	super(name, age, gender, empID, maBH);
	this.hoursPerWeek= hoursPerWeek;
	this.salaryID= salaryID;
}
//setter and getter
public int getHoursPerWeek() {
	return hoursPerWeek;
}
public void setHoursPerWeek(int hoursPerWeek) {
	this.hoursPerWeek = hoursPerWeek;
}
public int getSalaryID() {
	return salaryID;
}
public void setSalaryID(int salaryID) {
	this.salaryID = salaryID;
}
//nhap thong tin
public void input() {
	Scanner sc= new Scanner(System.in);
	int n;
	//nhap so cong nhan part time
	do {
		System.out.println("Nhap so cong nhan parttime:");
		n=sc.nextInt();
	}while(n<2||n>6);
	//nhap thong tin cua tung cong nhan
	PartTimeEmployee[] partTimeEmployees = new PartTimeEmployee[n];
	for(int i=0; i<n; ++i) {
		System.out.println("Dien thong tin cho cong nhan part time"+ (i+1));
		partTimeEmployees[i]=new PartTimeEmployee();
		System.out.println("Dien so gio lam viec moi tuan:");
		partTimeEmployees[i].hoursPerWeek=sc.nextInt();
		System.out.println("Dien don gia luong:");
		partTimeEmployees[i].salaryID=sc.nextInt();

		System.out.println(partTimeEmployees[i].toString());
	}
}
//hienthithongtin
@Override
public String toString() {
	return "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + ", salaryID=" + salaryID + ", empID=" + empID + ", maBH="
			+ maBH + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}


}
