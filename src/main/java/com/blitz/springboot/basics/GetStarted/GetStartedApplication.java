package com.blitz.springboot.basics.GetStarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.blitz.springboot.basics.GetStarted.SearchAlgorithm.ISearch;

@SpringBootApplication
public class GetStartedApplication {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GetStartedApplication.class, args);
		System.out.println("Testing the STARTing");
		ISearch binarySearch = applicationContext.getBean(ISearch.class);
		int numberToSearch=45;
		int[] numbers = {1,3,45,645,4534,23,53,56,67,6546};
		int result1 = binarySearch.search(numbers, numberToSearch);
		int result2 = binarySearch.search(numbers, numberToSearch);
		System.out.println(result1);
		System.out.println(result2);
		
	}

}

