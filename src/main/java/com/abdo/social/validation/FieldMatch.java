package com.abdo.social.validation;

public @interface FieldMatch {

	public @interface List {

		FieldMatch[] value();

	}

	String first();

	String second();

	String message();

}
