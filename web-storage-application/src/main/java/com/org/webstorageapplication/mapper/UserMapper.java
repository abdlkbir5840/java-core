package com.org.webstorageapplication.mapper;

import com.org.webstorageapplication.dto.UserDTO;
import com.org.webstorageapplication.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
}
