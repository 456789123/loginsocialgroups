package com.loginsocialgroups.loginsocialgroups;


import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoginsocialgroupsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginsocialgroupsApplication.class, args);
	}

	   @RequestMapping(value = "/user", method = RequestMethod.GET)
	   public Principal user(Principal principal) {
	      return principal;
	   }

	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public void teste(HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Estou aqui moleque doido!!");
	}


}
