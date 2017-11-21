package dondon.springframework.dependencyinjection.controllers;

import dondon.springframework.dependencyinjection.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
