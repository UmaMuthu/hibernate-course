package com.infiniteskills.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.infiniteskills.data.entities.Account;
import com.infiniteskills.data.entities.AccountType1;
import com.infiniteskills.data.entities.Bank;
import com.infiniteskills.data.entities.Bond;
import com.infiniteskills.data.entities.Budget;
import com.infiniteskills.data.entities.Credential;
import com.infiniteskills.data.entities.Currency;
import com.infiniteskills.data.entities.Investment;
import com.infiniteskills.data.entities.Market;
import com.infiniteskills.data.entities.Portfolio;
import com.infiniteskills.data.entities.Stock;
import com.infiniteskills.data.entities.TimeTest;
import com.infiniteskills.data.entities.Transaction;
import com.infiniteskills.data.entities.User;
import com.infiniteskills.data.entities.UserCredentialView;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			 configuration.addAnnotatedClass(User.class);
			// configuration.addAnnotatedClass(Account.class);
			 configuration.addAnnotatedClass(AccountType1.class);
			 configuration.addAnnotatedClass(TimeTest.class);
			 configuration.addAnnotatedClass(Bank.class);
			 configuration.addAnnotatedClass(Credential.class);
			 configuration.addAnnotatedClass(Account.class);
			 configuration.addAnnotatedClass(Transaction.class);
			 configuration.addAnnotatedClass(Budget.class);
			 configuration.addAnnotatedClass(Currency.class);
			 configuration.addAnnotatedClass(Market.class);
			 configuration.addAnnotatedClass(Stock.class);
			 configuration.addAnnotatedClass(Bond.class);
			 configuration.addAnnotatedClass(Portfolio.class);
			 configuration.addAnnotatedClass(Investment.class);
			 configuration.addAnnotatedClass(UserCredentialView.class);
			// configuration.addAnnotatedClass(Bank.class);
			// configuration.addAnnotatedClass(Transaction.class);
			return configuration.buildSessionFactory(
					new StandardServiceRegistryBuilder().build());
		
			//return configuration.buildSessionFactory(
					//new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("I am already in exception");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
