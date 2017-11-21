package dondon.springframework.dependencyinjection.controllers;

import dondon.springframework.dependencyinjection.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
