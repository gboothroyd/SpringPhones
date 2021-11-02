package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;
@SpringBootApplication
public class SpringPhonesApplication{ 
public static void main(String[] args) {
	SpringApplication.run(SpringPhonesApplication.class, args);
}
}

//@Autowired
//PhoneRepository repo;

//@Override
//public void run(String... args) throws Exception {
// TODO Auto-generated method stub

//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);


//Phone p = appContext.getBean("phone", Phone.class);

//p.setOperatingSystem("IOS");
//repo.save(p);

//Phone ph = new Phone("Samsung Galaxy", "Blue", "Android");
//repo.save(ph);

//List<Phone> allMyPhones = repo.findAll();

//for(Phone phone: allMyPhones) {
//System.out.println(phone.toString());


//}



