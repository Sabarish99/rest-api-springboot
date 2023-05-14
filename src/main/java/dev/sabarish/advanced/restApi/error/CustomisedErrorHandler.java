package dev.sabarish.advanced.restApi.error;

import dev.sabarish.advanced.restApi.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;

@ControllerAdvice
// creating class to deal with custom error message on REST actions
public class CustomisedErrorHandler extends ResponseEntityExceptionHandler {

    // @ExceptionHandler -> defines what kind of exception to encountered for the issue
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorHandling> handleAllExceptions(Exception ex, WebRequest request) throws Exception
    {
        ErrorHandling errorHandling = new ErrorHandling(ex.getMessage(), request.getDescription(false),
                LocalDate.now());

        return new ResponseEntity<>(errorHandling, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorHandling> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception
    {
        ErrorHandling errorHandling = new ErrorHandling(ex.getMessage(), request.getDescription(false),
                LocalDate.now());

        return new ResponseEntity<>(errorHandling, HttpStatus.NOT_FOUND);
    }
}
