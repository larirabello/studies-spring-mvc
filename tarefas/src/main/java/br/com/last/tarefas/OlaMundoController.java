package br.com.last.tarefas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OlaMundoController {
		
	@RequestMapping("/olaMundoSpring")
	public ModelAndView tarefas() {
		ModelAndView view = new ModelAndView("ok");
		return view;
	}
}
