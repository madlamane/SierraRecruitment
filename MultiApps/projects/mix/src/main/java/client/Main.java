package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories("repository")
@ComponentScan("controller,model,exception,repository")
@EntityScan(basePackages={"model"}) 
public class Main {

		public static void main(String[] args)
		{
			SpringApplication.run(Main.class,args);
		}
}