package com.org.webstorageapplication.service;

import com.org.webstorageapplication.dto.UserDTO;
import com.org.webstorageapplication.excepetion.AlreadyExistException;
import com.org.webstorageapplication.excepetion.NotFoundException;
import com.org.webstorageapplication.model.User;

import java.util.List;

public interface UserService {
    List<UserDTO> findAll();
    User findById(int id) throws NotFoundException;
    UserDTO save(UserDTO userDTO) throws AlreadyExistException;
    UserDTO update(UserDTO userDTO, int id) throws NotFoundException;
    void delete(int id) throws NotFoundException;
}
