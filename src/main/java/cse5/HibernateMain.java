package cse5;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import java.util.*;
public class HibernateMain {

	public static void main(String[] args) {
		try (
		Scanner s = new Scanner(System.in)) {
			String bankname = s.next();
			int accountno = s.nextInt();
			String accountname = s.next();
			
			Configuration cfg = new Configuration().configure("hibernate_cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();//session creation
			Session session = factory.openSession();//session  
			
			//create, read, update, delete
			Transaction tx = session.beginTransaction();
			Bank b = new Bank(bankname,accountno,accountname);
			session.persist(b);
			tx.commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Values are inserted");
	}

}
