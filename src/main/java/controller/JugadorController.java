package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JugadorController {
	
	@RequestMapping("/")
	public String index(Model modelo) {
		return "index";
	}

}
