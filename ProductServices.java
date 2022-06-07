package coreassignment;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductServices extends ProductRepository {
public static void main(String args[]) {

	System.out.println("PRODUCT LIST CENTRE");
	System.out.println("1. Find Product by Code");
	System.out.println("2. Find Max Price Product");
	System.out.println("3. Get products by Category ");
	System.out.println("4. Quit");
	System.out.println("Enter Your Choice: ");
	
	Scanner sc = new Scanner(System.in);
	int choice=sc.nextInt();
     switch(choice)
     {
     case 1:
    	 System.out.println(findNameByCode(101));break;
	case 2:
		System.out.println(findMaxPriceProduct("Smartphones"));break;
	case 3:
		Product[] arr=getProductsByCategory("Eatables");
		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
		break;
	case 4:
		System.exit(0);
        default:
	  System.out.println("Select valid Choice");}
	
	

}


	public static String findNameByCode(int num) {

		for(int i=0;i< list.size();i++) {
			if(list.get(i).getProductCode()==num)
			{
				return list.get(i).getName();
			}
		}
		return null;
	}
	public static Product findMaxPriceProduct(String category) {
		double maxPrice = Double.MIN_VALUE;
		int index = -1;
		for (int i = 0;i<list.size();i++)
		{
			if(list.get(i).getCategory().equals(category) && list.get(i).getPrice() >maxPrice) {
				maxPrice = list.get(i).getPrice();
				index = i;
			}
			}
		if (index == -1) {
			return null;
		} else {
			return list.get(index);
		}
	}
	
	public static Product[] getProductsByCategory(String category) {
		ArrayList<Product> cat=new ArrayList<Product>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getCategory().equals(category)) {
				cat.add(list.get(i));
			}
		}
		if(cat.isEmpty()) {
			return null;
		}
		else {
			Product[] arr=cat.toArray(new Product[cat.size()]);
			return arr;
		}
		
		
	}
	

	
}
