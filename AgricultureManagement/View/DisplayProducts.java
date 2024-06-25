package View;
import Controller.AdminProduct;
import java.util.*;
public class DisplayProducts {
	static List<List<Object>> productList;
	public DisplayProducts(List<List<Object>> productList){
		this.productList= productList;
	}
	public static void display() {
		for(List<Object>row:productList) {
			for(Object value:row) {
				System.out.print("  "+value+"\t"+"      ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------");
	}
}
