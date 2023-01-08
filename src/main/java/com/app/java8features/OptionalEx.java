package com.app.java8features;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		
		Optional<String> concat=Optional.of("A")
				.flatMap(a->Optional.of("B")
				.flatMap(b->Optional.of(a + b)));
		
		System.out.println(concat.get());

	}

}
