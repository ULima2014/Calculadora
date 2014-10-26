package edu.ulima.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "CalculadorService")
public class CalculadorService {

    @WebMethod(operationName = "Suma")
    public Float Suma(@WebParam(name = "Operando1") float Operando1, @WebParam(name = "Operando2") float Operando2) {
        //TODO write your implementation code here:
        return Operando1+Operando2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Resta")
    public Float Resta(@WebParam(name = "Operando1") float Operando1, @WebParam(name = "Operando2") float Operando2) {
        //TODO write your implementation code here:
        return Operando1-Operando2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplicacion")
    public Float Multiplicacion(@WebParam(name = "Operando1") float Operando1, @WebParam(name = "Operando2") float Operando2) {
        //TODO write your implementation code here:
        return Operando1*Operando2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Division")
    public Float Division(@WebParam(name = "Operando1") float Operando1, @WebParam(name = "Operando2") float Operando2) {
        //TODO write your implementation code here:
        return Operando1/Operando2;
    }
}
