package com.org.webstorageapplication.service.impl;

import com.org.webstorageapplication.dto.UserDTO;
import com.org.webstorageapplication.excepetion.AlreadyExistException;
import com.org.webstorageapplication.excepetion.NotFoundException;
import com.org.webstorageapplication.mapper.UserMapper;
import com.org.webstorageapplication.model.User;
import com.org.webstorageapplication.repository.UserRepository;
import com.org.webstorageapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public List<UserDTO> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public User findById(int id) throws NotFoundException {
        return userRepository
                .findById(id)
                .orElseThrow(()-> new NotFoundException(String.format("User with ID %d not found", id)));
    }

    @Override
    public UserDTO save(UserDTO userDTO) throws AlreadyExistException {
        Optional<User> existingUser = userRepository.findByUserName(userDTO.getUserName());
        if(existingUser.isPresent())
            throw new AlreadyExistException(String.format("Username  %s Already exist", userDTO.getUserName()));
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO update(UserDTO userDTO, int id) throws NotFoundException {
        User existingUser = findById(id);
        BeanUtils.copyProperties(userDTO, existingUser, "id");
        return userMapper.toDto(userRepository.save(existingUser));
    }

    @Override
    public void delete(int id) throws NotFoundException {
        findById(id);
        userRepository.deleteById(id);
    }
}
