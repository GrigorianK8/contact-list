package com.example.contactlist.mapper;

import com.example.contactlist.dto.ContactDTO;
import com.example.contactlist.entity.Contact;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    ContactDTO toDTO(Contact contact);
    Contact toEntity(ContactDTO contactDTO);
}
