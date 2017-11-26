package dondon.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO_CONSTRUCTOR = "Hello from Constructor!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_CONSTRUCTOR;
    }
}
