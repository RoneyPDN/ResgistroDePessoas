package br.projetoUm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
