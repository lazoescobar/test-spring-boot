package com.dev.inventario;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class App {
	Logger logger = LoggerFactory.getLogger(App.class.getName());
	@GetMapping("/")
	public HashMap<String, String>index() {
		String fechaInicio = ZonedDateTime.now(ZoneId.of("America/Santiago"))
                .format(DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a"));
		logger.info("Inicio " + App.class.getSimpleName()+"."+"index - " + fechaInicio);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("responde", "200");
		String fechaFin = ZonedDateTime.now(ZoneId.of("America/Santiago"))
                .format(DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm:ss a"));
		logger.info("Fin " + App.class.getSimpleName()+"."+"index - "+ fechaFin);
		return map;
	}
	
	public String getDifferenceBetwenDates(Date dateInicio, Date dateFinal) {
	    long milliseconds = dateFinal.getTime() - dateInicio.getTime();
	    int seconds = (int) (milliseconds / 1000) % 60;
	    int minutes = (int) ((milliseconds / (1000 * 60)) % 60);
	    int hours = (int) ((milliseconds / (1000 * 60 * 60)) % 24);
	    return  "";
	}
	
}