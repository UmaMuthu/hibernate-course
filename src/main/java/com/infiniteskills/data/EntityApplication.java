package com.infiniteskills.data;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.infiniteskills.data.entities.Account;
import com.infiniteskills.data.entities.Bank;

public class EntityApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("infinite-finances");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Bank bank = createBank();
		
		em.persist(bank);
		TypedQuery<Account> query = em.createQuery("select distinct a from Transaction t"
				+ " join t.account a "
				+ "where t.amount > 50 ",Account.class);
		
		List<Account> accounts = query.getResultList();
		System.out.println("account Size"+accounts.size());
		
		for(Account a:accounts){
			System.out.println("accountName"+a.getName());
		}
		t.commit();
		em.close();
		emf.close();
	}
	
	private static Bank createBank() {
		Bank bank = new Bank();
		bank.setInternational(true);
		bank.setName("NewState");
		bank.setAddressLine1("G2");
		bank.setAddressLine2("EC");
		bank.setAddressType("Official");
		bank.setCity("Blr");
		bank.setCreatedBy("Uma");
		bank.setLastUpdatedBy("Uma");
		bank.setCreatedDate(new Date());
		bank.setLastUpdatedDate(new Date());
		bank.setState("KA");
		bank.setZipcode("56003");
		return bank;
	}


}
