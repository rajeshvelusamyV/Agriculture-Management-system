package Main;
import Controller.UserLogin;
import Model.DbgetDetails;
import Controller.UserSignUp;
import Model.DbAdminProducts;
import View.DisplayProducts;
import View.DisplaySeller;

import java.util.*;
import Controller.AdminValidation;
import Controller.Buyerproducts;
import Controller.AdminProduct;
import Controller.SellerDetails;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for admin");
		System.out.println("Enter 2 for buyer");
		System.out.println("Enter 3 for seller");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			while(true) {
			System.out.println("Enter AdminName");
			String name=sc.next().toUpperCase();
			System.out.println("Enter the password");
			String password=sc.next().toUpperCase();
			AdminValidation admin=new AdminValidation(name,password);
			if(admin.validation()) {
				admin.display();
				break;
			}
			else {
				System.out.println("please enter the details correctly");
			}
		}
			while(true) {
			System.out.println("Enter 1 to view the products");
			System.out.println("Enter 2 to view the buyer details");
			System.out.println("Enter 3 to view the seller details");
			System.out.println("Enter 4 to delete the product");
			System.out.println("Enter 5 to exit");
			System.out.println("-------------------------------------------------------------------------------");
			int ch1=sc.nextInt();
		if(ch1==5) {
			break;
		}
		else {
		switch(ch1) {
		case 1:
			AdminProduct admin=new AdminProduct();
			admin.display();
		case 2:
			//break;
		case 3:
			//break;
		case 4:
			//break;
	
		}
		}
			
	}
		break;
		case 2:
			System.out.println("Enter 1 for login");
			System.out.println("Enter 2 for signup");
			int ch1=sc.nextInt();
			switch(ch1) {
			case 1:
			System.out.println("Enter the username");
			String username=sc.next().toUpperCase();
			System.out.println("Enter the password");
			String password=sc.next().toUpperCase();
			while(true) {
				UserLogin user=new UserLogin(username,password);
				if(user.validation()) {
					user.display();
					break;
				}
				else {
					System.out.println("please enter the correct username and password");
				}
			}
			break;
			case 2:
				while(true) {
				System.out.println("Enter the username");
				String username1=sc.next().toUpperCase();
				System.out.println("Enter the mailid");
				String mail=sc.next().toUpperCase();
				System.out.println("Enter the password");
				String password1=sc.next().toUpperCase();
				System.out.println("Enter the age");
				String age=sc.next();
				int age1=Integer.parseInt(age);
				if(mail.length()>=8 && mail.contains("@") && mail.contains("GMAIL.COM")) {
					UserSignUp signup=new UserSignUp(username1,mail,password1,age1);
					signup.insert();
					signup.display();
					break;
				}
				else {
					System.out.println("please enter the correct details-----");
				}
				}
			}
			while(true) {
			System.out.println("Enter 1 to view products ");
			System.out.println("Enter 2 to get details of the seller");
			System.out.println("Enter 3 to exit");
			System.out.println("-------------------------------------------------------------------------------");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1:
				Buyerproducts p=new Buyerproducts();
				p.display();
				break;
			case 2:
				System.out.println("Enter the product name");
				String productname=sc.next().toUpperCase();
				DbgetDetails products=new DbgetDetails();
				List<List<Object>> al=products.productList(productname);
				DisplayProducts display1=new DisplayProducts(al);
				display1.display();
				break;
				
				
			case 3:
				System.out.println("Please note down the contact no and seller_name");
				System.out.println("Thankyou visit again--------");
				return;
			//break;
			}
			}
		case 3:
			System.out.println("Enter 1 for login");
			System.out.println("Enter 2 for signup");
			int ch2=sc.nextInt();
			switch(ch2) {
			case 1:
				while(true) {
			System.out.println("Enter the username");
			String username=sc.next().toUpperCase();
			System.out.println("Enter the password");
			String password=sc.next().toUpperCase();
				UserLogin user=new UserLogin(username,password);
				if(user.validation()) {
					user.display();
					break;
				}
				else {
					System.out.println("please enter the correct username and password");
				}
			}
			break;
			case 2:
				while(true) {
				System.out.println("Enter the username");
				String username1=sc.next().toUpperCase();
				System.out.println("Enter the mailid");
				String mail=sc.next().toUpperCase();
				System.out.println("Enter the password");
				String password1=sc.next().toUpperCase();
				System.out.println("Enter the age");
				String age=sc.next();
				int age1=Integer.parseInt(age);
				if(mail.length()>=8 && mail.contains("@") && mail.contains("GMAIL.COM")) {
					UserSignUp signup=new UserSignUp(username1,mail,password1,age1);
					signup.insert();
					signup.display();
					break;
				}
				else {
					System.out.println("please enter the correct details-----");
				}
				}
			}
			while(true) {
				System.out.println("Enter 1 for selling the  product");
				System.out.println("Enter 2 for changing the price for already existing product");
				System.out.println("Enter 3 to exit");
				int choice2=sc.nextInt();
				switch(choice2) {
				case 1:
			System.out.println("Enter the seller name");
			String sellername=sc.next().toUpperCase();
			System.out.println("Enter the product name you want to sell");
			String productname=sc.next().toUpperCase();
			System.out.println("Enter the price of product");
			String price=sc.next().toUpperCase()+"PERKG";
			System.out.println("Enter the no.of.acres you planted");
			String acres=sc.next().toUpperCase()+"ACRES";
			System.out.println("Enter the Location you have planted");
			String location=sc.next().toUpperCase();
			sc.nextLine();
			System.out.println("Enter the contact details");
			String number=sc.next();
			SellerDetails detail=new SellerDetails(sellername,productname,price,acres,location,number);
				detail.insert1();
				case 2:
					System.out.println("Enter the product name");
					String name=sc.next();
					System.out.println("Enter the contact no");
					String contactno=sc.next();
				case 3:
					System.out.println("Thankyou for using our website");
					System.out.println("please ensure to attend calls from the unknown number");
					System.out.println("Thankyou visit again-----------------------");
					return;
				}
			}
			
		//break;
	}
}
}
