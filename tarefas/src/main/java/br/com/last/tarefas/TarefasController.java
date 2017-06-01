package br.com.last.tarefas;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

// O controller retorna por padrão uma view, enquanto o RestController retorna um json
@Controller
public class TarefasController {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	
	/* CAELUM */
	
	@RequestMapping("/novaTarefa")
	public String form() {
		return "formulario";
	}
	  
	@RequestMapping("adicionaTarefa")
	public String adiciona() {
		Tarefa tarefa = new Tarefa();
		/*
		tarefa.setDescricao("5");
		tarefa.setId(5);
		tarefa.setDataFinalizacao(Calendar.getInstance().getTime());
		tarefa.setFinalizado(true);
		tarefaRepository.save(tarefa);
		*/
		return "tarefa-adicionada";
	}
	
	/* TESTES */
	
	@RequestMapping("/")
	public ModelAndView tarefas() {
		ModelAndView view = new ModelAndView("index");
		// Para utilizar  o findByDescricaoStartsWith do Repository
		//view.addObject("tarefas", tarefaRepository.findByDescricaoStartsWith("Tare"));
		view.addObject("tarefas", tarefaRepository.findAll());
		return view;
	}
	
	@RequestMapping("/tarefas")
	@ResponseBody
	public List<Tarefa> listaTarefas () {
		return tarefaRepository.findAll();
	}

	@RequestMapping("/add")
	@ResponseBody
	public void add () {
		Tarefa t = new Tarefa();
		t.setDescricao("5");
		t.setId(5);
		t.setDataFinalizacao(Calendar.getInstance().getTime());
		t.setFinalizado(true);
		tarefaRepository.save(t);
	}

}
