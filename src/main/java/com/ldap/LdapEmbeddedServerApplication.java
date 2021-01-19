package com.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LdapEmbeddedServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdapEmbeddedServerApplication.class, args);
	}

}
