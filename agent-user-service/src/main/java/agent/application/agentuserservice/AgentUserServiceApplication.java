package agent.application.agentuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AgentUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgentUserServiceApplication.class, args);
	}

}
