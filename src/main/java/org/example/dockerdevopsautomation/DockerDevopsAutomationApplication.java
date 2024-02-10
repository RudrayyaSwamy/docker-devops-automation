package org.example.dockerdevopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DockerDevopsAutomationApplication {


    @GetMapping("/")
    public String getMessage(){
        return "welcome to docker devops automation";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDevopsAutomationApplication.class, args);
    }

}
