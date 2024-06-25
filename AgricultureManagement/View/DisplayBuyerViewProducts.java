package View;

import java.util.List;
import Controller.Buyerproducts;

public class DisplayBuyerViewProducts {
		static List<List<Object>> productList;
		public DisplayBuyerViewProducts(List<List<Object>> productList){
			this.productList= productList;
		}
		public static void display() {
			for(List<Object>row:productList) {
				for(Object value:row) {
					System.out.print(value+"\t"+"       ");
				}
				System.out.println();
			}
			System.out.println("--------------------------------------------------------------");
		}
	}
