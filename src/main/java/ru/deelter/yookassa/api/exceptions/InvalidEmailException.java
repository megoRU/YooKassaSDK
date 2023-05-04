package ru.deelter.yookassa.api.exceptions;

import org.jetbrains.annotations.Nullable;

public class InvalidEmailException extends RuntimeException {

	public InvalidEmailException(@Nullable String email) {
		super(String.format("Email %s is not valid", email));
	}
}
