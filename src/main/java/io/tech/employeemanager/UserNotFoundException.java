package io.tech.employeemanager;

/**
 * @author Hamza Ouni
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
