package com.goit.Mod14Dev;
import com.goit.Mod14Dev.service.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Mod14DevApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Mod14DevApplication.class, args);
		NoteService noteService = context.getBean(NoteService.class);
	}
}
