package com.example.panavuweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.panavuweb.model.Userr;

@Repository
public interface UserrRepository extends JpaRepository<Userr, Long>{

    
}
