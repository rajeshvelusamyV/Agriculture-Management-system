package Controller;
import Model.DbUserLogin;
import View.DisplayUserValidation;
public class UserLogin {
	String username;
	String password;
	public UserLogin(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public  boolean validation() {
		DbUserLogin login=new DbUserLogin();
		if(login.userValidation(username,password)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void display() {
		DisplayUserValidation display=new DisplayUserValidation();
		display.display1();
	}
}
