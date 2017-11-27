package dondon.springframework.dependencyinjection.config;

import dondon.springframework.dependencyinjection.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${fake.username}")
    String user;

    @Value("${fake.password}")
    String password;

    @Value("${fake.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();

        // user environment variable
//        fakeDataSource.setUser(environment.getProperty("FAKE_USERNAME"));
//        fakeDataSource.setUrl(environment.getProperty("FAKE_PASSWORD"));
//        fakeDataSource.setUser(environment.getProperty("FAKE_DBURL"));

        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

        return configurer;
    }

}
