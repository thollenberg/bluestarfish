package com.valueblue.api.error;

import lombok.Getter;
import lombok.Setter;

public class ErrorResponse {
    @Getter @Setter private String message;
    @Getter @Setter private int statusCode;
}
