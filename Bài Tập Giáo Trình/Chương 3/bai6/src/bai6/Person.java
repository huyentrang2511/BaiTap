package bai6;
import java.util.Scanner;
public class Person {
protected String name;
protected int age;
protected char gender;
//ham tao
void Person() {
}
void Person(String name, int age, char gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
}
//setter and getter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
//nhapthongtin
public void input() {
	Scanner scanner = new Scanner(System.in);
    System.out.print("dien ten: ");
    this.name = scanner.nextLine();
    System.out.print("dien tuoi: ");
    this.age = scanner.nextInt();
    System.out.print("dien gioi tinh (M/F): ");
    this.gender = scanner.next().charAt(0);
   
}
//hienthithongtin
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}

}
