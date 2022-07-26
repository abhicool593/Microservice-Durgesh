package com.contact.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.Entity.Contact;
import com.contact.Repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepo;
	
	public List<Contact> getContactsOfUser(Long userId){
		return this.contactRepo.findByUserId(userId);
	}

}
