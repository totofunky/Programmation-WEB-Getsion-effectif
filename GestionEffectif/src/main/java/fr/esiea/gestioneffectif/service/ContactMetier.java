package fr.esiea.gestioneffectif.service;

import java.util.List;

import fr.esiea.gestioneffectif.model.Adresse;
import fr.esiea.gestioneffectif.model.Contact;

public interface ContactMetier {
	public void addContact(Contact c);
	public List<Contact> getAllContacts();

	public void addContact(Contact c, Adresse a);

	void updateContact(Contact c, Adresse a, String id);
	Contact getContactById(String id);
	Contact modifyContact(String id);
	void deleteContact(String id);
}