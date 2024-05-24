package com.example.contactlist.service;

import com.example.contactlist.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

public interface ContactService {

    public Page<Contact> getAllContacts(int page, int size);

    public Contact  getContact(String id);

    public Contact  createContact(Contact contact);

    public void deleteContact(Contact contact);

    public String uploadPhoto(String id, MultipartFile file);
}
