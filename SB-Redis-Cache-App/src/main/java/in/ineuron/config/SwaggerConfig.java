package in.ineuron.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Install Redis-Cache and configure
 */

@Configuration
public class SwaggerConfig {

	@Bean
	public GroupedOpenApi restApi() {
		return GroupedOpenApi.builder()
				.group("rest-api")
				.packagesToScan("in.ineuron.rest")
				.pathsToMatch("/**")
				.build();
	}

}