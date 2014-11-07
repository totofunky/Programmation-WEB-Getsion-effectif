package fr.esiea.gestioneffectif.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import fr.esiea.gestioneffectif.util.HibernateUtil;

/*public class ContactImplDataBase implements ContactDAO {

	public void init() {
		System.out.println("hi gg");
	}

	@Override
	public void addContact(Contact c) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public List<Contact> getAllContact() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		return session.createQuery("from Contact").list();
	}

	@Override
	public void addContact(Contact c, Adresse a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Contact modifyContact(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContact(Contact c, Adresse a, String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Contact getContactById(String id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = (Contact) session.load(Contact.class, id);
		return c;
	}

	@Override
	public void deleteContact(String id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = (Contact) session.load(Contact.class, id);
		session.delete(c);
		session.getTransaction().commit();
	}

}*/
