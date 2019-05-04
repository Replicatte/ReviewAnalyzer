package com.upv.alumn.ReviewAnalyzer;

import edu.stanford.nlp.sentiment.*;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

@SpringBootApplication
public class ReviewAnalyzerApplication {

	public static void main(String[] args) {

//		ApplicationContext context =
//				new AnnotationConfigApplicationContext(RabbitConfiguration.class);
//		AmqpTemplate template = context.getBean(AmqpTemplate.class);
//		template.convertAndSend("myqueue", "foo");
//		String foo = (String) template.receiveAndConvert("myqueue");




		// Run the Spring Application
		SpringApplication.run(ReviewAnalyzerApplication.class, args);
	}

}
