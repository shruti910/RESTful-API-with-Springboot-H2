package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

@GetMapping(value = "/{id}")
public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {

         
        return hospitalService.getHospital(id);
    }

@GetMapping(value = "/")
public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return hospitalService.getAllHospitals();
    }


 @PostMapping(value = "/")
public @ResponseBody Hospital addHospital(@RequestBody Hospital hospital  ) {

	return hospitalService.addHospital(hospital);
}

//@PutMapping(value = "/hospitals/{id}")
//public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital, @PathVariable("hId")String hId) {
//	
//	 int h= Integer.parseInt(hId);
//		return hospitalService.updateHospital(hospital, h);
//}

@PutMapping(value = "/")
public @ResponseBody Hospital updateHospital(@RequestBody Hospital hospital) {
	
		return hospitalService.updateHospital(hospital);
}

//@DeleteMapping(value = "/hospitals/{id}")
//public ResponseEntity<String> deleteHospital( @PathVariable("hId")String hId) {
//
//	 int h= Integer.parseInt(hId);
//		return hospitalService.deleteHospital(h);
//}

@DeleteMapping(value = "/")
@ResponseBody 
public void  deleteById( @RequestBody Hospital hospital) {

		 hospitalService.deleteById(hospital);
                
}

}
