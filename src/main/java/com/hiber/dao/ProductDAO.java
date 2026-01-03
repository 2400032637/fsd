package com.hiber.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hiber.entity.Product;
import com.hiber.utils.HibernameUtils;

public class ProductDAO {

	//Create the Record
	public void saveProduct(Product p) {
		try(Session session = HibernameUtils.getSessionFactory().openSession()){
			
			Transaction tx = session.beginTransaction();
			session.save(p);
			tx.commit();
			
		}
	} 	//Reading all the Products
	public List<Product> getProducts(){
		try(Session session = HibernameUtils.getSessionFactory().openSession()){
			return session.createQuery("FROM Product", Product.class).list();
		}
	}
}