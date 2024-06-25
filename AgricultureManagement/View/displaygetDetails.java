package View;

import java.util.List;

public class displaygetDetails {
	static List<List<Object>> productList;
	public displaygetDetails(List<List<Object>> productList){
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
