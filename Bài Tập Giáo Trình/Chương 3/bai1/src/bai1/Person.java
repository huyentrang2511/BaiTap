package bai1;

public class Person {
	//cac thuoc tinh
protected String name;
protected String dob;
protected String pob;
protected char gender;
protected String email;
protected String phone;
	//ham tao khong doi
public Person() {
	this.name="unknown";
	this.dob="unknown";
	this.pob="unknown";
	this.gender='u';
	this.email="unknown";
	this.phone="unknown";
}
	//ham tao co doi
public Person(String name, String dob, String pob, char gender, String email, String phone) {
	this.name=name;
	this.dob=dob;
	this.pob=pob;
	this.gender=gender;
	this.email=email;
	this.phone=phone;
}
	//setter va getter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPob() {
	return pob;
}
public void setPob(String pob) {
	this.pob = pob;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
    if (gender == 'm' || gender == 'f') {
        this.gender = gender;
    } else {
        System.out.println("Giá trị không hợp lệ cho giới tính (chỉ nhận 'm' hoặc 'f')");
    }
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
//to String
@Override
public String toString() {
	return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
			+ ", phone=" + phone + "]";
}

}
