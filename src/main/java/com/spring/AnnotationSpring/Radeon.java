package com.spring.AnnotationSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Radeon implements GraphicCard {

	public void process() {
		System.out.println("My Graphic Card");
	}

}
