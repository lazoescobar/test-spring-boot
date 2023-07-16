package com.dev.inventario;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class App {
	
	@GetMapping("/")
	public HashMap<String, String>index() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("responde", "200");
		return map;
	}
}