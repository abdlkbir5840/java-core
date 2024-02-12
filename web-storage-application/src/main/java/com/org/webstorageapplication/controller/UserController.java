package com.org.webstorageapplication.controller;

import com.org.webstorageapplication.dto.UserDTO;
import com.org.webstorageapplication.excepetion.AlreadyExistException;
import com.org.webstorageapplication.excepetion.NotFoundException;
import com.org.webstorageapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll(){
        return ResponseEntity.ok(userService.findAll());
    }
    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO) throws AlreadyExistException {
        return ResponseEntity.ok(userService.save(userDTO));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> edite(@RequestBody UserDTO userDTO, @PathVariable int id) throws NotFoundException {
        return ResponseEntity.ok(userService.update(userDTO, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable int id) throws NotFoundException {
         userService.delete(id);
         return ResponseEntity.noContent().build();
    }
}
