package dondon.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_DONDON = "Hello Dondon!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_DONDON;
    }

}