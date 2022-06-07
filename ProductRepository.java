package coreassignment;

import java.util.ArrayList;



public class ProductRepository {
	
public static ArrayList<Product> list = new ArrayList<Product>() {
	{
	add(new Product(101,"Iphone",50000.00,"Smartphones"));
	add(new Product(102,"Fridge",30000.00,"Home Appliances"));
	add(new Product(103,"Chips",50.00,"Eatables"));
	add(new Product(104,"Maggi",50000.00,"Eatables"));
}
};
}
