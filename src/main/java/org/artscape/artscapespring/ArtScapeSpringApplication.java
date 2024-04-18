package org.artscape.artscapespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtScapeSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtScapeSpringApplication.class, args);
        System.out.println("App is Runnin!");
    }

}