package com.example.security.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.function.BinaryOperator;

@Controller
public class HomeController
{
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String show()
	{

		return "index";
	}

	@GetMapping("/login")
	public String login()
	{

		return "login";
	}
	@GetMapping("/register")
	public String showregister(Model model)
	{
		model.addAttribute("user", new User());
		return "registration";
	}

	@RequestMapping("/register")
	public String processregister(@Valid @ModelAttribute("user") User user, BindingResult result, Model model)
	{
		model.addAttribute("user", user);
		if(result.hasErrors())
		{
			return "registration";
		}
		else
		{
			userService.saveUser(user);
			model.addAttribute("message", "user logged in");
		}
		return "index";
	}


}


