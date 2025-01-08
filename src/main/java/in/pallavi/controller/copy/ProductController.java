package in.pallavi.controller.copy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.pallavi.binding.Product;
import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	//Method to display the form
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	//method to handle the form submission
	@PostMapping("/product")
	public String handleSubmitBtn(@Valid Product p, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
			
		}else{
			model.addAttribute("msg", "Product Saved");
			
		}
		return "index";
		
		
		
		
	}
}
