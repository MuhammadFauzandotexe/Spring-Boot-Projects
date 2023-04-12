package org.ojan.thymleaf.fruit;
import java.util.*;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class FruitResource {   
	 
	@GetMapping("fruit")
	public String getAllDataFruit(Model model) {
		return "FruitTemplates/fruit";
	}

}
