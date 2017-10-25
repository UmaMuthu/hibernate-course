package com.infiniteskills.data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.infiniteskills.data.entities.*;


public class Application {

	public static void main(String[] args) {

		/* Building SessionFactory */
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		/* Obtain Session and Call Persistence Methods */
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		//Query query = session.createQuery("select distinct t.account from Transaction t where t.amount>100");
		User user = createUser();
		session.save(user);
		/*UserCredentialView user_view = (UserCredentialView) session.get(UserCredentialView.class, 1L);
		System.out.println("firstName"+user_view.getFirstName());
		System.out.println(user_view.getLastName());*/
		/*userDao dao = new UserHibernateDao();
		dao.setSession(session);
		*/
		
		/*Portfolio p = new Portfolio();
		p.setName("Uma Folder");
		
		Stock s = createStock();
		s.setPortfolio(p);
		
		Bond b = createBond();
		b.setPortfolio(p);
		
		p.getInvestments().add(s);
		p.getInvestments().add(b);
		session.save(s);
		session.save(b);*/
		/*Account ac = createAccount();
		session.save(ac);*/
		/*Currency currency = new Currency();
		currency.setName("Dollar1");
		currency.setCountryName("US1");
		currency.setSymbol("$");
		
		Market market = new Market();
		market.setMarketName("LVB");
		market.setCurrency(currency);
		session.persist(market);*/
		
		

		/*
		 * 
		 * Bank detachedbank = (Bank)session.get(Bank.class,1L);
		 * detachedbank.setName("Flush Checking"); System.out.println(
		 * "Calling flush"); session.flush(); detachedbank.setCity("Trichy");
		 * System.out.println("Calling commit");
		 */
		/*
		 * session.getTransaction().commit(); session.close();
		 */

		/*
		 * Session session1 = sessionFactory.openSession();
		 * session1.getTransaction().begin(); Bank transientBank = createBank();
		 * detachedbank.setName("UpdatedName");
		 * session1.saveOrUpdate(detachedbank);
		 * session1.saveOrUpdate(transientBank);
		 */
		// session.getTransaction().begin();
		/*
		 * session.getTransaction().begin(); Account account = createAccount();
		 * account.getTransactions().add(createBeltPurchase(account));
		 * account.getTransactions().add(createShoePurchase(account));
		 * System.out.println(session.contains(account)); session.save(account);
		 * System.out.println("after save"+session.contains(account));
		 */
		/*
		 * Account account = createAccount(); Account account1 =
		 * createAccount(); User user1 = createUser(); User user2 =
		 * createUser();
		 * 
		 * account1.getUsers().add(user1); account1.getUsers().add(user2);
		 * account.getUsers().add(user1); account.getUsers().add(user2);
		 * session.save(account); session.save(account1);
		 * 
		 * Account dbAccount = (Account)session.get(Account.class,
		 * account.getAccount_id());
		 * System.out.println(dbAccount.getUsers().iterator().next().
		 * getFirstName());
		 */
		/*
		 * Account account = createAccount(); Budget budget = createBudget();
		 * budget.getTransactions().add(createBeltPurchase(account));
		 * budget.getTransactions().add(createShoePurchase(account));
		 * session.save(budget);
		 * 
		 * Transaction t = (Transaction) session.get(Transaction.class,
		 * budget.getTransactions().get(0).getTransactionId());
		 * System.out.println("Trans details"+t.getAccount().getAccount_type());
		 */
		 /*Account account = createAccount();
		  account.getTransactions().add(createBeltPurchase(account));
		account.getTransactions().add(createShoePurchase(account));
		  session.save(account);
		  
		  Transaction t = (Transaction) session.get(Transaction.class,
		  account.getTransactions().get(0).getTransactionId());
		 System.out.println("Trans details"+t.getAccount().getAccount_type());
		 */
		/*
		 * Bank bank = new Bank(); bank.setAddressLine1("G2");
		 * bank.setAddressLine2("EC"); bank.setAddressType("Official");
		 * bank.setCity("Blr"); bank.setCreatedBy("Uma");
		 * bank.setLastUpdatedBy("Uma"); bank.setCreatedDate(new Date());
		 * bank.setLastUpdatedDate(new Date()); bank.setState("KA");
		 * bank.setZipcode("56003"); bank.setName("Lakshana");
		 * bank.getContacts().put("PLACE1","jayanagar");
		 * bank.getContacts().put("PLACE2","Sarjapur"); session.save(bank);
		 */
		// session.beginTransaction();
		/*
		 * AccountType type = new AccountType();
		 * 
		 * type.setName("Checking"); type.setCreatedDate(new Date());
		 * type.setLastUpdatedDate(new Date());
		 * type.setCreatedBy("kevinbowersox");
		 * type.setLastUpdatedBy("kevinbowersox"); session.save(type);
		 */
		/*
		 * User user = new User(); user.setBirthDate(getMyBirthDate());
		 * user.setCreatedBy("Uma"); user.setCreatedDate(new Date());
		 * user.setEmailAddress("uh@hp.com"); user.setFirstName("Lucky");
		 * user.setLastName("Uma"); user.setLastUpdatedBy("Uma");
		 * user.setLastUpdatedDate(new Date()); Address address = new Address();
		 * address.setAddressLine1("Owners Court");
		 * address.setAddressLine2("Apts"); address.setCity("blr");
		 * address.setState("KA"); address.setZipCode("11111"); Address address1
		 * = new Address(); address1.setAddressLine1("Owners Court1");
		 * address1.setAddressLine2("Apts1"); address1.setCity("blr1");
		 * address1.setState("TN"); address1.setZipCode("22222");
		 * user.getAddress().add(address); user.getAddress().add(address1);
		 * 
		 * Credential credential = new Credential();
		 * credential.setPassword("uma"); credential.setUsername("uma");
		 * credential.setUser(user); user.setCredential(credential);
		 * session.save(credential); session.getTransaction().commit();
		 * System.out.println("before refresh"+user.toString()); User dbUser =
		 * (User) session.get(User.class, credential.getUser().getUserId());
		 * System.out.println("persisted User"+dbUser.getFirstName());
		 * session.refresh(user); System.out.println("after refresh"
		 * +user.toString());
		 */
		/*
		 * TimeTest time = new TimeTest(new Date()); session.save(time);
		 * 
		 * session.getTransaction().commit(); System.out.println(
		 * "before refresh"+time.toString()); session.refresh(time);
		 * System.out.println("after refresh"+time.toString());
		 */
		/*
		 * session.beginTransaction(); User u =
		 * (User)session.get(User.class,2L); u.setFirstName("Modified");
		 * session.save(u);
		 * 
		 */
		session.getTransaction().commit();
		
		/*Stock s1 = (Stock)session.get(Stock.class, s.getInvestmentId());
		System.out.println("stock portfolio"+s1.getPortfolio().getName());
		Bond b1 = (Bond)session.get(Bond.class, b.getInvestmentId());
		System.out.println("Bond portfolio"+b1.getPortfolio().getName());
		Portfolio p1 = (Portfolio)session.get(Portfolio.class, p.getPortfolioId());
		System.out.println(p1.getName());
		for(Investment t:p1.getInvestments())
		{
			System.out.println(t.getName());
		}*/
		/*Account ac1 = (Account)session.get(Account.class,ac.getAccount_id());
		System.out.println(ac1.getAccount_type());*/
		/*Market dbMarket = (Market)session.get(Market.class, market.getMarketId());
		System.out.println(dbMarket.getCurrency().getName());*/
		session.close();

		/*Session session2 = HibernateUtil.getSessionFactory().openSession();
		session2.beginTransaction();
		Currency dbCurrency = (Currency)session2.get(Currency.class, new CurrencyId("Dollar","US"));
		System.out.println("dbCurrency"+dbCurrency.getName());
		session2.getTransaction().commit();
		session2.close();*/

	}

	private static Bank createBank() {
		Bank bank = new Bank();
		bank.setInternational(true);
		bank.setName("InterState");
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

	public static Budget createBudget() {
		Budget budget = new Budget();
		budget.setName("GST");
		budget.setGoalAmount(new BigDecimal(200));
		budget.setPeriod("Yearly");
		return budget;

	}

	public static Account createAccount() {
		Account acc = new Account();
		acc.setAccount_type(AccountType.SAVINGS);
		acc.setCloseDate(new Date());
		acc.setInitialBalance(new BigDecimal(100));
		acc.setCurrentBalance(new BigDecimal(1000));
		acc.setLastUpdatedBy("Uma");
		acc.setLastUpdatedDate(new Date());
		acc.setOpenDate(new Date());
		acc.setCreatedBy("Uma");
		acc.setCreatedDate(new Date());
		return acc;
	}

	public static Transaction createBeltPurchase(Account account) {
		Transaction t = new Transaction();
		t.setTitle("Belt");
		t.setLastUpdatedBy("Uma");
		t.setLastUpdatedDate(new Date());
		t.setNotes("Hello");
		t.setCreatedBy("Uma");
		t.setClosingBalance(new BigDecimal(1000));
		t.setAmount(new BigDecimal(100));
		t.setCreatedBy("Uma");
		t.setCreatedDate(new Date());
		t.setInitialBalance(new BigDecimal(1000));
		t.setTransactionType("cash");
		t.setAccount(account);
		return t;
	}

	public static Transaction createShoePurchase(Account account) {
		Transaction t = new Transaction();
		t.setTitle("Shoe");
		t.setLastUpdatedBy("Uma");
		t.setLastUpdatedDate(new Date());
		t.setNotes("Hello");
		t.setCreatedBy("Uma");
		t.setClosingBalance(new BigDecimal(1000));
		t.setAmount(new BigDecimal(500));
		t.setCreatedBy("Uma");
		t.setCreatedDate(new Date());
		t.setInitialBalance(new BigDecimal(1000));
		t.setTransactionType("cash");
		t.setAccount(account);
		return t;
	}

	private static Date getMyBirthDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 27);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.YEAR, 2015);
		return calendar.getTime();
	}

	private static User createUser() {

		User user = new User();
		Address address = createAddress();

		user.setBirthDate(getMyBirthDate());
		user.setCreatedBy("Uma");
		user.setCreatedDate(new Date());
		user.setEmailAddress("uh@hp.com");
		user.setFirstName("Lucky");
		user.setLastName("Uma");
		user.setLastUpdatedBy("Uma");
		user.setLastUpdatedDate(new Date());
		user.setAddress(Arrays.asList(new Address[] { createAddress() }));
		return user;
	}

	private static Address createAddress() {
		Address address1 = new Address();
		address1.setAddressLine1("Owners Court1");
		address1.setAddressLine2("Apts1");
		address1.setCity("blr1");
		address1.setState("TN");
		address1.setZipCode("22222");
		return address1;
	}
	
	private static Stock createStock()
	{
		Stock s = new Stock();
		s.setIssuer("LVB");
		s.setQuantity(10);
		s.setSharePrice(new BigDecimal(200));
		s.setName("Lakshmi Vilas Bank");
		s.setPurchaseDate(new Date());
		return s;
	}
	
	private static Bond createBond()
	{
		Bond b = new Bond();
		b.setName("Lakshmi Vilas Bank Bond");
		b.setIssuer("LVB");
		b.setPurchaseDate(new Date());
		b.setValue(200);
		b.setMaturityDate(new Date());
		b.setInterestRate(new BigDecimal(10));
		return b;
	}
}
