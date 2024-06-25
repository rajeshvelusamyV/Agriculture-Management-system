package Controller;
import View.DisplayValidation;
import AgricultureManagement.DbConnection;
import Model.DbAdmin;
public class AdminValidation {
	String name;
	String password;
	public AdminValidation(String name,String password){
		this.name=name;
		this.password=password;
	}
	public boolean validation() {
		DbAdmin db=new DbAdmin();
		if(db.adminValidation(name, password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void display() {
		DisplayValidation display=new DisplayValidation();
		display.display();
	}
}
