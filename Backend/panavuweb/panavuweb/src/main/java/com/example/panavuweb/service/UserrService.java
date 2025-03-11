package com.example.panavuweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.panavuweb.model.Userr;
import com.example.panavuweb.repository.UserrRepository;

@Service
public class UserrService {
    @Autowired
    private UserrRepository userrRepository;

    public List<Userr> GetUsers(){
        return userrRepository.findAll();
    }

    public Optional<Userr> GetUserById(Long id){
        return userrRepository.findById(id);
    }

    public Userr SaveUser(Userr user){
        System.out.println("Guardando usuario " + user);
        Userr savedUser = userrRepository.save(user);
        System.out.println("Usuario guardado con id: " + savedUser.getUser_id());
        return savedUser;
    }

    public Userr UpdateUser(Long id, Userr newUser){
        return userrRepository.findById(id).map(user -> {
            user.setUsername(newUser.getUsername());
            user.setUser_password(newUser.getUser_password());
            user.setUser_email(newUser.getUser_email());
            return userrRepository.save(user);
        }).orElseThrow(() -> new RuntimeException("Usuario no encontrado con el id: " + id));
    }

    public void DeleteUser(Long id){
        userrRepository.deleteById(id);;
    }
}
