package com.stackroute.MusicSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigMusicSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringConfigMusicSystemApplication.class, args);
	}

}

