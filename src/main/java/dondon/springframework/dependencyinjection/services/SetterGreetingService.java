package dondon.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO_SETTER = "Hello from Setter!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_SETTER;
    }

}
