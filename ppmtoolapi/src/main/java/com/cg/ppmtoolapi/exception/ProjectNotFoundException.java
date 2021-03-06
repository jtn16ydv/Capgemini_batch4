package com.cg.ppmtoolapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create ProjectIdException object without error message
	 */
	public ProjectNotFoundException() {
		super();
	}
	/**
	 * Create ProjectIdException object with error message
	 */
	public ProjectNotFoundException(String errMsg) {
		super(errMsg);
	}

}
