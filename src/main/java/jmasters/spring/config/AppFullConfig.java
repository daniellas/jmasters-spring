package jmasters.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({ AppConfig.class, AppPrototypeConfig.class, AppSingletonConfig.class, AppMultiplierSummatorConfig.class })
@PropertySource(value = "classpath:app.properties", ignoreResourceNotFound = true)
public class AppFullConfig {

}
