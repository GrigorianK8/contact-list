package com.example.contactlist.service;

import com.example.contactlist.dto.ContactDTO;
import com.example.contactlist.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

public interface ContactService {

    Page<ContactDTO> getAllContacts(int page, int size);

    ContactDTO  getContact(String id);

    ContactDTO  createContact(ContactDTO contactDTO);

    void deleteContact(Contact contact);

    String uploadPhoto(String id, MultipartFile file);
}
