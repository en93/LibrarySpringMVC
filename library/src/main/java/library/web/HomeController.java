package library.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import library.models.*;

@Controller
@RequestMapping({"/", "/home", "homepage", "index"})
public class HomeController {
	
	@GetMapping
	public String home() {
		Loan testbook = new Loan();
		testbook.setId(0);
		testbook.setLoans(0);
		return "home";
	}
	

}
