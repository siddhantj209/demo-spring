package com.sid.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		int[] a = {1,4,2,6,5};
		IntStream.of(a).max();
		System.out.println(Arrays.stream(a).max().getAsInt());
		System.out.println("hello world");
	}

}
