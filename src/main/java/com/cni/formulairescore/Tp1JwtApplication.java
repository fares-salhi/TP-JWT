package com.cni.formulairescore;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cni.formulairescore.entities.Role;
import com.cni.formulairescore.entities.User;
import com.cni.formulairescore.services.UserService;

@SpringBootApplication
public class Tp1JwtApplication implements CommandLineRunner {
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(Tp1JwtApplication.class, args);	
	}
	
	@Bean
	static BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public void run(String... args) throws Exception {
		//ajouter les rôles
		/*	userService.addRole(new Role(null,"ADMIN"));
				userService.addRole(new Role(null,"USER"));
				//ajouter les users
				userService.saveUser(new User(null,"admin","123",true,null));
				userService.saveUser(new User(null, "emna","123",true,null));
				userService.saveUser(new User(null, "mohamed","123",true,null));
				//ajouter les rôles aux users
				userService.addRoleToUser("admin", "ADMIN");
				userService.addRoleToUser("admin", "USER");
				userService.addRoleToUser("emna", "USER");
				userService.addRoleToUser("mohamed", "USER");
			*/	
	}

}
