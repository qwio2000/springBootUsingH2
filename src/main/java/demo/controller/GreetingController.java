package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.model.Friends;
import demo.repository.FriendsRepository;

@Controller
public class GreetingController {
	
	@Autowired
	private FriendsRepository repository;
	
	@RequestMapping(value="/greeting")
	public String helloMethod(Model model,
			@RequestParam(value="userId",required=false)String userId){
		Friends friends = repository.findByUserId(userId);
		model.addAttribute("name",friends.getName());
		return "greeting";
	}
}
