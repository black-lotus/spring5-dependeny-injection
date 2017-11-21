package dondon.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Dondon!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }

}