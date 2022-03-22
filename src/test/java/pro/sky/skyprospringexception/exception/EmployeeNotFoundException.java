package pro.sky.skyprospringexception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import pro.sky.skyprospringexception.service.Employee;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
    private static final String DEFFAULT_MESSAGE = "Employee not found";

    public EmployeeNotFoundException() {
        super(DEFFAULT_MESSAGE);
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeNotFoundException(Throwable cause) {
        super(cause);
    }
}