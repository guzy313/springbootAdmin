package com.aa.server11;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Server11Application {

	public static void main(String[] args) {
		SpringApplication.run(Server11Application.class, args);
	}

}
