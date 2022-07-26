package com.contact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.Entity.Contact;
import com.contact.Service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		return this.contactservice.getContactsOfUser(userId);
	}

}
