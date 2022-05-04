package com.spring.AnnotationSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Asus {
	@Autowired
	@Qualifier("nvidia")
	private GraphicCard gc;
	
	public GraphicCard getGc() {
		return gc;
	}

	public void setGc(GraphicCard gc) {
		this.gc = gc;
	}

	public void config() {
		System.out.println("512GB SSD, 8 GB RAM, 4K display");
		gc.process();
	}
}
