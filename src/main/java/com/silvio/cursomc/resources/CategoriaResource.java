package com.silvio.cursomc.resources;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public String lista() {
		return "Rest está funcionando";
		
	}
}
