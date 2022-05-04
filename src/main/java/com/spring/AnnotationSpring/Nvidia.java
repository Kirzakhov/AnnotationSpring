package com.spring.AnnotationSpring;

import org.springframework.stereotype.Component;

@Component
public class Nvidia implements GraphicCard {

	public void process() {
		System.out.println("World's best graphic card");
	}

}
