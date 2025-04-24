package com.sazzad.maven;

import java.util.logging.Logger;

import com.sazzad.maven.services.ColorPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColorApplication implements CommandLineRunner {
	private ColorPrinter colorPrinter;

	public ColorApplication(ColorPrinter colorPrinter){
		this.colorPrinter = colorPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colorPrinter.print());
	}
}
