package com.hiber;

import java.util.List;

import com.hiber.dao.ProductDAO;
import com.hiber.entity.Product;

public class App {
    public static void main(String[] args) {

    	ProductDAO pdao = new ProductDAO();
    	
    	Product p1 = new Product();
    	p1.setPid(1006L);
    	p1.setPname("Keyboards");
    	p1.setQty(220);
    	p1.setPrice(600.00);
    	
    	pdao.saveProduct(p1);
    	
    	Product p2 = new Product();
    	p2.setPid(1007L);
    	p2.setPname("Mouses");
    	p2.setQty(150);
    	p2.setPrice(855.95);
    	pdao.saveProduct(p2);
//    	
    	List<Product> plist = pdao.getProducts();
    	for(Product p : plist) {
    		System.out.println(p);
    	}
    }
}