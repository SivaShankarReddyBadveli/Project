package com.gofortrainings.newsportal.core.models;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "test configurations", description = "This config is help for providing runtime valuesn to test service.")

public @interface TestConfig {

	@AttributeDefinition(name = "task", description = "first", required = true)
	public String task() default "testing task";
	
	@AttributeDefinition(name = "programe", description = "second", required = true)
	public String programe() default "testing programe";
}
