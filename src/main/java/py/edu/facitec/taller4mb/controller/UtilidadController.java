package py.edu.facitec.taller4mb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class UtilidadController {
	@ RequestMapping ("/comollegar")
	
public String index(){
	

		
		System.out.println("cargo la pagina");
		
		return "comollegar.jsp";

}
}