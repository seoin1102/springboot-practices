package ex01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class MyComponent implements ApplicationRunner {
	
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("do somethig1.......");
		System.out.println("do somethig2.......");
		System.out.println("do somethig3.......");
		System.out.println("do somethig4.......");
	}

}
