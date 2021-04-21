/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ilma Zahil
 */
@WebService(serviceName = "ICT2WebService")
public class ICT2WebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "isConnected")
    public int isConnected() {
        //TODO write your implementation code here:
        System.out.println("Testing Connection...");
        return 0;
    }

    /**
     * Web service operation
     * @param x
     * @param y
     * @return 
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "divide")
    public Double divide(@WebParam(name = "x") Double x, @WebParam(name = "y") Double y) throws Exception {
        //TODO write your implementation code here:
        
        return x/y;
    }

    /**
     * Web service operation
     * @param x
     * @param y
     * @return 
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "safeDivide")
    public Double safeDivide(@WebParam(name = "x") Double x, @WebParam(name = "y") Double y) throws Exception {
        //TODO write your implementation code here:
        System.out.println("[SERVER] - add (" + x + " divide " + y +" )");
        
        if(y==null)
            throw new Exception("This is null");
        if((y==null) && (x==null))
            throw new Exception("This is null");
            
        return x/y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addDoubleOnServer")
    public Double addDoubleOnServer(@WebParam(name = "x") Double x, @WebParam(name = "y") Double y) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLargestDoubleOnServer")
    public Double getLargestDoubleOnServer() {
        //TODO write your implementation code here:
        return null;
    }

    
}
