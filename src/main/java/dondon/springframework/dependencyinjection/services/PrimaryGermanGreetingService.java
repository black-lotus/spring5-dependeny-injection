package dondon.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }

}