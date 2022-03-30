package com.contact.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	//fake list of contacts
	List<Contact> list = Arrays.asList(
			new Contact(1L,"amit@gmail.com","amit",1211L),
			new Contact(2L,"anit@gmail.com","anit",1211L),
			new Contact(3L,"sumit@gmail.com","sumit",1311L));
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
