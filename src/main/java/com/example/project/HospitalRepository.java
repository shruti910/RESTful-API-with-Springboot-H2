package com.example.project;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;



public interface HospitalRepository  extends CrudRepository<Hospital, Integer>{
    public Optional<Hospital> findById(int hId);

   
    public void deleteById(int hId);

}

