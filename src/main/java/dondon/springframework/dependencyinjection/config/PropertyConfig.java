package dondon.springframework.dependencyinjection.config;

import dondon.springframework.dependencyinjection.examplebeans.FakeDataSource;
import dondon.springframework.dependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})

public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${fake.username}")
    String user;

    @Value("${fake.password}")
    String password;

    @Value("${fake.dburl}")
    String url;

    @Value("${fake.jms.username}")
    String jmsUsername;

    @Value("${fake.jms.password}")
    String jmsPassoword;

    @Value("${fake.jms.url}")
    String jmsUrl;

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

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUsername);
        jmsBroker.setPassword(jmsPassoword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

        return configurer;
    }

}
