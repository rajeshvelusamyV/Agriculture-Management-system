package Controller;
import Model.DbUserSignup;
import View.DisplayUserSignup;
public class UserSignUp {
	String username;
	String mail;
	String password;
	int age;
	public UserSignUp(String username,String mail,String password,int age) {
		this.username=username;
		this.mail=mail;
		this.password=password;
		this.age=age;
	}
	public void insert() {
		DbUserSignup signup=new DbUserSignup();
		signup.signup(username,mail,password,age);
	}
	public void display() {
		DisplayUserSignup display=new DisplayUserSignup();
		display.display1();
		
	}
}
