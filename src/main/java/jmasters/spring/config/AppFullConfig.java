package jmasters.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ AppConfig.class, AppPrototypeConfig.class, AppSingletonConfig.class })
public class AppFullConfig {

}
