package dondon.springframework.dependencyinjection;

import dondon.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import dondon.springframework.dependencyinjection.controllers.MyController;
import dondon.springframework.dependencyinjection.controllers.PropertyInjectedController;
import dondon.springframework.dependencyinjection.controllers.SetterInjectedController;
import dondon.springframework.dependencyinjection.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		// external properties
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println("external properties :: user => " + fakeDataSource.getUser());

		MyController myController = (MyController) context.getBean("myController");

		System.out.println(myController.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
