package com.QA;

import com.QA.Scope.BeanScopeTestService;
import com.QA.Scope.SingletonBean;
import com.QA.config.DataSourceConfig;
import com.QA.services.OrderService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class QaApplication  implements CommandLineRunner {

	@Autowired
	private DataSourceConfig dataSourceConfig;
	@Value("${spring.profiles.active}")
	private String envArgs;
	@Autowired
	Environment environment;
//	@Value("${discount.offer.price}")
//	private int discount;
//	@PostConstruct
//	public void initLogic(){
//		System.out.println("PostConstruct logic executed....!");
////		System.out.println("Discount value :"+discount);
//		System.out.println(envArgs);
//		System.out.println("Discount value :"+environment.getProperty("discount.offer.price"));
//		System.out.println("DataSource Username : "+ dataSourceConfig.getUsername() +" DataSource Password: "+dataSourceConfig.getPassword());
//	}

	public static void main(String[] args) {
		System.out.println("Main method .......!");
		ConfigurableApplicationContext context = SpringApplication.run(QaApplication.class, args);
//		OrderService orderService = context.getBean("orderService", OrderService.class);
//		orderService.test();

//		BeanScopeTestService service = context.getBean(BeanScopeTestService.class);
//		BeanScopeTestService service1 = context.getBean(BeanScopeTestService.class);
//		BeanScopeTestService service2 = context.getBean(BeanScopeTestService.class);

		SingletonBean singletonBean = context.getBean(SingletonBean.class);
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println("hashcode : " +singletonBean.hashCode() +" "+singletonBean1.hashCode());


	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Command Liner method.. executed...");
	}
}
