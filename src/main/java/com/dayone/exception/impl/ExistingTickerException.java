package com.dayone.exception.impl;

import com.dayone.exception.AbstractException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class ExistingTickerException extends AbstractException {

	private String ticker;
	@Override
	public int getStatusCode() {
		return HttpStatus.BAD_REQUEST.value();
	}

	@Override
	public String getMessage() {
		return ticker + "는 이미 존재하는 회사명입니다.";
	}
}
