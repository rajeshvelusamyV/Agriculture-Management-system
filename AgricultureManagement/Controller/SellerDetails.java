package Controller;
import Model.DbSellerDetails;
import View.DisplaySeller;
public class SellerDetails {
	String sellername;
	String productname;
	String price;
	String acres;
	String location;
	String number;
	public SellerDetails(String sellername,String productname,String price,String acres,String location,String number) {
		this.sellername=sellername;
		this.productname=productname;
		this.price=price;
		this.acres=acres;
		this.location=location;
		this.number=number;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price=price;
	}
	public void insert1() {
		DbSellerDetails details=new DbSellerDetails();
		details.insert(sellername,productname,price,acres,location,number);
		 
	}
	public void changeprice() {
		
	}
	public void display() {
		DisplaySeller seller=new DisplaySeller();
		seller.display();
	}
}
