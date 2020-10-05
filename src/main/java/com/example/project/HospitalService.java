package com.example.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;


public List<Hospital> getAllHospitals(){
    List<Hospital> hospDataList = new ArrayList<>();
                for(Hospital i :  hospitalRepository.findAll()){
                hospDataList.add(i);
                }
	return hospDataList;
}

public Hospital getHospital(int id){
     Optional<Hospital> hosp = hospitalRepository.findById(id);   
		  return hosp.get();
	
}

public Hospital addHospital(Hospital hospital){
    Hospital newhosp= new Hospital();
		newhosp.setId(hospital.getId());
		newhosp.setName(hospital.getName());
                newhosp.setCity(hospital.getCity());
                newhosp.setRating(hospital.getRating());
	    return hospitalRepository.save(newhosp);

}

public Hospital updateHospital(Hospital hospital){
   Hospital newhosp= new Hospital();
		 Optional<Hospital> uphosp = hospitalRepository.findById(hospital.getId());
                 if(uphosp.isPresent()) {
                   newhosp =uphosp.get();
                     
                     newhosp.setName(hospital.getName());
                    newhosp.setCity(hospital.getCity());
                     newhosp.setRating(hospital.getRating());
                        
		 }
       
       return hospitalRepository.save(newhosp);
}

@Transactional
public void deleteById(Hospital hospital) {
    int hid=hospital.getId();
            hospitalRepository.deleteById(hid);
}
}
