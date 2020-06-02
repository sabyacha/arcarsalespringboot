package com.Banking.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Banking.modal.RetrieveImage;
import com.Banking.modal.User;
import com.Banking.services.ImageRetrieveService;
import com.Banking.services.UserSelectionService;

@Controller
public class TestController {
public String json="";
	/*
	 * @RequestMapping("/Welcome") public ModelAndView firstPage() { return new
	 * ModelAndView("Welcome"); }
	 */
	@Autowired
	//private UserService userService;
	private UserSelectionService UserSelectionService;
	@RequestMapping("/Welcome")
	
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	
@RequestMapping("/CarHome")
	
	public String CarHome() {
		//request.setAttribute("mode", "MODE_HOME");
		return "CarHome";
	}

@RequestMapping("/products")

public String products(HttpServletRequest request) {
//request.setAttribute("car",carservice.getImage(1));	
request.setAttribute("mode", "image1");
request.setAttribute("jsonImage1", "{Option: \'1\', coloumn: \'1\'}");
	return "CarTypes";
}


@RequestMapping("/image1")
public String image1(HttpServletRequest request) {
	json="{Option: \'1\', coloumn: \'1\'}";
	//UserSelectionService.deleteMySelection(1); 
	//UserSelection.setSelection(1);
	//UserSelection.setId(1); 
	//UserSelectionService.saveMySelection(UserSelection); 
	//request.setAttribute("jsonImage1",UserSelectionService.editUser(1));	
	//System.out.println(request.getAttribute("jsonImage1")+".....ImagePath1....");
	request.setAttribute("jsonImage1", "{Option: \'1\', coloumn: \'1\'}");
	request.setAttribute("mode", "image1");
	request.setAttribute("mode", "json1");
	
	return "CarTypes";
}
@RequestMapping("/image2")
public String image2(HttpServletRequest request) {
	json="{Option: \'1\', coloumn: \'2\'}";
		/*
		 * UserSelectionService.deleteMySelection(1); UserSelection.setSelection(2);
		 * UserSelection.setId(1); UserSelectionService.saveMySelection(UserSelection);
		 * request.setAttribute("jsonImage1",UserSelectionService.editUser(1));
		 * System.out.println(request.getAttribute("jsonImage1")+".....ImagePath2....");
		 */
	request.setAttribute("jsonImage1", "{Option: \'1\', coloumn: \'2\'}");
	request.setAttribute("mode", "image2");
	
	
	return "CarTypes";
}
@RequestMapping("/image3")
public String image3(HttpServletRequest request) {
	json="{Option: \'1\', coloumn: \'3\'}";
		/*
		 * UserSelectionService.deleteMySelection(1); UserSelection.setSelection(3);
		 * UserSelection.setId(1); UserSelectionService.saveMySelection(UserSelection);
		 * request.setAttribute("jsonImage1",UserSelectionService.editUser(1));
		 * System.out.println(request.getAttribute("jsonImage1")+".....ImagePath3....");
		 */
	request.setAttribute("jsonImage1", "{Option: \'1\', coloumn: \'3\'}");
	request.setAttribute("mode", "image3");
	
	
	return "CarTypes";
}
@RequestMapping("/image4")
public String image4(HttpServletRequest request) {
	json="{Option: \'1\', coloumn: \'4\'}";
		/*
		 * UserSelectionService.deleteMySelection(1); UserSelection.setSelection(4);
		 * UserSelection.setId(1); UserSelectionService.saveMySelection(UserSelection);
		 * request.setAttribute("jsonImage1",UserSelectionService.editUser(1));
		 * System.out.println(request.getAttribute("jsonImage1")+".....ImagePath4....");
		 */
	request.setAttribute("jsonImage1", "{Option: \'1\', coloumn: \'4\'}");
	request.setAttribute("mode", "image4");
	
	//request.setAttribute("jsonImage1", "{Option: \'4\', coloumn: \'4\'}");
	return "CarTypes";
}

@RequestMapping("/home")
	
	public String home() {
		return "homepage";
	}

@RequestMapping("/registration")

public String registration(HttpServletRequest request) {
	request.setAttribute("mode", "MODE_REGISTER");
	return "welcomepage";
}

@RequestMapping("/userselection")

public String userselection(HttpServletRequest request) {
	
	
	request.setAttribute("jsonvalue", json);
	return "jsonOutput";
}
/*
@PostMapping("/save-user")
public String registerUser(@ModelAttribute User user,BindingResult bindingResult, HttpServletRequest request) {
	userservice.saveMyUser(user);
	request.setAttribute("mode", "MODE_HOME");
	return "welcomepage";
}
	
@GetMapping("/show-users")
public String showAllUser(HttpServletRequest request) {
	request.setAttribute("users",userservice.showAllUsers());
	request.setAttribute("mode", "ALL_USERS");
	return "welcomepage";
}

@RequestMapping("/delete-user")
public String deleteUser(@RequestParam int id, HttpServletRequest request) {
	userservice.deleteMyUser(id); 
	request.setAttribute("users",userservice.showAllUsers());	
	request.setAttribute("mode", "ALL_USERS");
	return "welcomepage";
}

@RequestMapping("/edit-user")
public String editUser(@RequestParam int id, HttpServletRequest request) {
	//userservice.editUser(id); 
	//request.setAttribute("user",userservice.showAllUsers());	
	request.setAttribute("user",userservice.editUser(id));	
	request.setAttribute("mode", "MODE_UPDATE");
	return "welcomepage";
}
*/
}
