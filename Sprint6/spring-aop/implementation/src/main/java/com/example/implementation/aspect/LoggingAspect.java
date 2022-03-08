package com.example.implementation.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import java.util.Arrays;


// Fala que a classe é um Aspect
@Aspect
@Component
@Slf4j
public class LoggingAspect {


    /**
     * Pointcut que corresponde a todos os repositórios, serviços e endpoints Web REST.
     */
    @Pointcut("within(@org.springframework.stereotype.Repository *)" +
            " || within(@org.springframework.stereotype.Service *)" +
            " || within(@org.springframework.web.bind.annotation.RestController *)")
    public void springBeanPointcut() {
        // O método está vazio, pois é apenas um Pointcut, as implementações estão nos  advices.
    }

    // point cut

    /**
     * Pointcut que corresponde a todos os beans Spring nos pacotes principais do aplicativo.
     */
    @Pointcut("within(net.guides.springboot2.springboot2jpacrudexample..*)"+
            " || within(net.guides.springboot2.springboot2jpacrudexample.service..*)"+
            " || within(com.example.contract.controller..*)")
    public void applicationPackagePointcut() {
        // O método está vazio, pois é apenas um Pointcut, as implementações estão nos advices.
    }

    /**
     * Advice que registram métodos lançando exceções.
     *
     * @param joinPoint join point for advice
     * @param e exception
     */


  //  Ele garante que um Advice seja executado se um método lançar uma exceção.
  //  Usamos a anotação @AfterThrowing para implementar o conselho após o lançamento

    @AfterThrowing(pointcut = "applicationPackagePointcut() && springBeanPointcut()", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        log.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), e.getCause() != null? e.getCause() : "NULL");
    }

    /**
     * Advice that logs when a method is entered and exited.
     *
     * @param joinPoint join point for advice
     * @return result
     * @throws Throwable throws IllegalArgumentException
     */

   // que é o conselho mais poderoso.
  //  O conselho em torno pode impedir a execução real do método e retornar uma resposta em nome dos métodos.
  //  Ele também pode alterar os valores dos argumentos para o método de destino.

    @Around("applicationPackagePointcut() && springBeanPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        if (log.isDebugEnabled()) {
            log.debug("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                    joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        }
        try {
            Object result = joinPoint.proceed();
            if (log.isDebugEnabled()) {
                log.debug("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
                        joinPoint.getSignature().getName(), result);
            }
            return result;
        } catch (IllegalArgumentException e) {
            log.error("Illegal argument: {} in {}.{}()", Arrays.toString(joinPoint.getArgs()),
                    joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            throw e;
        }
    }
}
