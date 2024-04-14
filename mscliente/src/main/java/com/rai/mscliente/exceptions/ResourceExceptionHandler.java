package com.rai.mscliente.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(DomainException.class) //para que seja capaz de captar a exceção e fazer o tratamento presente no metodo abaixo
    public ResponseEntity<StandardError> resourceNotFound(DomainException e, HttpServletRequest request){

        String error ="Ja existe"; //mensagem de erro para o usuario
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY; //tipo enumerado que mostra o status da exceção


        //construindo um novo objeto da classe que criamos, que contem os valores que aparecera para o usuario la no JSON
        //instant.now (mostra o momento do erro)
        //status.value (mostra o status do erro)
        //erro (mostra a mensagem que nos criamos no começo do metodo)
        //e.getmessage (pega a mensagem da classe de exceção que criamos e mostra no corpo da exceção)
        //request.getresquestURI (captura o caminho que apresentou o erro)
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);



    }






}
