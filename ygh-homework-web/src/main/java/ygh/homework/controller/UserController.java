package ygh.homework.controller;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value="/member/login",method=RequestMethod.POST)
	public String login(String username,String password){
		System.out.println(username+":"+password);
		password = new String(Base64.decodeBase64(password));
		System.out.println(username+":"+password);
		return "success";
	}
}
