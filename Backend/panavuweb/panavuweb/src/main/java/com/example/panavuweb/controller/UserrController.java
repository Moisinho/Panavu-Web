package com.example.panavuweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.panavuweb.model.Userr;
import com.example.panavuweb.service.UserrService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserrController {
    
    @Autowired
    private UserrService userService;

    @GetMapping
    public List<Userr> GetUsers(){
        return userService.GetUsers();
    }

    @GetMapping("/{id}")
    public Optional<Userr> GetUserById(@PathVariable Long id){
        return userService.GetUserById(id);
    }

    @PostMapping
    public Userr SaveUser(@RequestBody Userr user){
        System.out.println("Recibiendo el usuario: " + user);
        return userService.SaveUser(user);
    }

    @PutMapping("/{id}")
    public Userr UpdateUser(@PathVariable Long id, @RequestBody Userr user){
        return userService.UpdateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void DeleteUser(@PathVariable Long id){
        userService.DeleteUser(id);
    }
}
