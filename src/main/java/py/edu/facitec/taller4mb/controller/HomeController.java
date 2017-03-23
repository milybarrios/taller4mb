package py.edu.facitec.taller4mb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller

public class HomeController {
	
	@RequestMapping("/")
	
	public String index(){
		
		System.out.println("carge la pagina");
		return "pagina_home";
	}
	

}


