package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/helloDeploymentWorld")
    public String sayHello() {
        return "Api working in prodmode!";
    }
}
