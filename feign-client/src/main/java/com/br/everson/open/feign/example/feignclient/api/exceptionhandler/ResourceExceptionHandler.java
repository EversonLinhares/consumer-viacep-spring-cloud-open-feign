package com.br.everson.open.feign.example.feignclient.api.exceptionhandler;

import com.br.everson.open.feign.example.feignclient.domain.service.exception.CepInvalidoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors handleValidationErros(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        List<String> messages = bindingResult.getAllErrors()
                .stream()
                .map( objectError -> objectError.getDefaultMessage())
                .collect(Collectors.toList());
        return new ApiErrors(messages);
    }



    @ExceptionHandler(CepInvalidoException.class)
    public ResponseEntity<String> objectNotFound(CepInvalidoException e, HttpServletRequest request){
        String msg = e.getMessage();
        ApiErrors apiErrors = new ApiErrors(msg);
        return new ResponseEntity(apiErrors, HttpStatus.NOT_FOUND);
    }

}
