package Controller;

import Model.DbBuyerViewProducts;
import View.DisplayBuyerViewProducts;
import java.util.*;
public class Buyerproducts {
	public void display() {
	DbBuyerViewProducts products=new DbBuyerViewProducts();
	List<List<Object>> al=products.productList();
	DisplayBuyerViewProducts display1=new DisplayBuyerViewProducts(al);
	display1.display();
	}
}
