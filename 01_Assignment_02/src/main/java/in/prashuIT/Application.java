package in.prashuIT;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.prashuIT.service.ParshuService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		 ConfigurableApplicationContext context= 
				 SpringApplication .run(Application.class, args);
		 
		 ParshuService bean= context.getBean(ParshuService.class);
		 bean.saveParshu();
	}

}
