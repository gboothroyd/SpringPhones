package dmacc.controller;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Oct 18, 2021
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dmacc.beans.Phone;
@Configuration
public class BeanConfiguration {
@Bean
public Phone phone() {
	Phone bean = new Phone();
	bean.setName("Iphone");
	bean.setColor("Black");
	bean.setOperatingSystem("IOS");
return bean;
}
}
