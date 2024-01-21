package com.pinaki.movie.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Resource Not Found on Server !!");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
