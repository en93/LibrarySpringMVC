package library.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/home", "homepage", "index"})
public class HomeController {
	
	@GetMapping
	public String home() {
		return "home";
	}
	

}
