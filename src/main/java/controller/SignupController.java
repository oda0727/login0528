package controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import domain.entity.UserDetailEntity;
import form.UserDetailForm;
import service.UserService;

@Controller

public class SignupController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/signup")
	public String displaySignup(Model model) {
		
		return "/signup/form";
	}
	
	
	@PostMapping("/singup/regist")
	public String registUserData(UserDetailForm userDetailForm) {
		
		UserDetailEntity userDetail = new UserDetailEntity();
		
		UUID uuid = UUID.randomUUID();
		
		String insUuid = uuid.toString();
		
		userDetail.setUserName(userDetailForm.getUserName());
		userDetail.setPassword(userDetailForm.getPassword());
		userDetail.setEmail(userDetailForm.getEmail());
		userDetail.setUuid(insUuid);
		
		userService.registUserDetail(userDetail);
		
		return "/singup/sendMail";
	}
	

}
