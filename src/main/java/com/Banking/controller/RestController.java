package com.Banking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Banking.modal.*;
import com.Banking.services.CarService;
import com.Banking.services.UserSelectionService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/CarImage")
public class RestController {
	
	@Autowired
	//private UserService userService;
	private UserSelectionService UserSelectionService;
	
	@GetMapping("/")
	public String Login() {
		return "Signin";
	}
	
	/*
	 * @RequestMapping(value="/{id}", method=RequestMethod.GET) public
	 * Optional<User> edit(@PathVariable("id") int id) { return
	 * this.userService.editUser(id); }
	 */
	@RequestMapping("/saveCarImage")
	public void savecar(RetrieveImage RetrieveImage) {
		/*
		 * user.setAge(30); user.setFirstname("sdasdasd");
		 * user.setLastname("sadasdasd"); user.setPassword("asdasdasd");
		 * user.setUsername("sadasd"); user.setId(6); userService.saveMyUser(user);
		 */
		
		/*
		 * car.setId(3); car.setImagepath("test"); car.setItemdis("test");
		 * car.setItemnumber("test"); carService.saveMyCarImage(car);
		 */
		RetrieveImage.setCarimagedis("kjlkjk");
		RetrieveImage.setCarimagename("dfsdfds");
		RetrieveImage.setCarimagepath("sdsdfsdf");
		RetrieveImage.setId(5);
		
		 
	}
	/*
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<RetrieveImage> getImage(@PathVariable("id") int id) {
	  return this.ImageRetrieveService.editUser(id);
	}
	*/
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<UserSelection> editSelection(@PathVariable("id") int id,com.Banking.modal.UserSelection UserSelection) {
		UserSelection.setSelection(2); 
	  return this.UserSelectionService.editUser(id);
	}

	
	/*
	 * @GetMapping("/saveuser") public String saveUser(@RequestParam String
	 * username, @RequestParam String firstname, @RequestParam String
	 * lastname, @RequestParam int age, @RequestParam String password) { User user =
	 * new User(username, firstname, lastname, age, password);
	 * userService.saveMyUser(user); return "User Saved"; }
	 */

}
