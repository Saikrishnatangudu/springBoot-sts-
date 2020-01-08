package com;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StsdemoApplication.class, args);

	}

	  private static Logger logger = LogManager.getLogger(StsdemoApplication.class);

	@GetMapping(value = "/")
	public String fun() {
		logger.info("helooooo");
		return "Saikrishna....,Welcome to Spring Tool Suite";
	}


}
