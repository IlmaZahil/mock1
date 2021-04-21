/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict2client;
import ict2client.Exception_Exception;

/**
 *
 * @author Ilma Zahil
 */
public class ICT2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICT2Client client = new ICT2Client();
        client.execute();
    }

    private void execute() {
        System.out.println("[CLIENT] - Testing Connection...");
        if(isConnected()==0){
            System.out.println("[CLIENT] - Server is Connected... Test can Proceed...");
            Double x;
            Double y;
            Double z;
            x = 1.0;
            y = 2.0;
               
            try{
                z= divide(x,y);
                System.out.println("[CLIENT] - The serevr reurned "+ x + "/" + y +" = " +z);
            }
            catch(Exception_Exception ex){
                System.out.println("Exception Cought ...." + ex.getMessage());
            }
            x = 1.0;
            y = null;
            
            try{
                z= safeDivide(x,y);
                System.out.println("[CLIENT] - The serevr reurned "+ x + "/" + y +" = " +z);
            }
            catch(Exception_Exception ex){
                System.out.println("Exception Cought ...." + ex.getMessage());
            }
            try{
                x = 5.0;
                y = 5.0;
                z= divide(x,y);
                System.out.println("[CLIENT] - The serevr reurned "+ x + "/" + y +" = " +z);
            }
            catch(Exception_Exception ex){
                System.out.println("Exception Cought ...." + ex.getMessage());
            }
        }
        else{
            System.out.println("[CLIENT] - Server is MOT Connected... Test Failed...");
        }
        
        System.out.println("[CLIENT] - Test Completed...");
    }

    private static int isConnected() {
        ict2client.ICT2WebService_Service service = new ict2client.ICT2WebService_Service();
        ict2client.ICT2WebService port = service.getICT2WebServicePort();
        return port.isConnected();
    }

    private static Double divide(Double x, Double y) throws Exception_Exception {
        ict2client.ICT2WebService_Service service = new ict2client.ICT2WebService_Service();
        ict2client.ICT2WebService port = service.getICT2WebServicePort();
        return port.divide(x, y);
    }

    private static Double safeDivide(Double x, Double y) throws Exception_Exception {
        ict2client.ICT2WebService_Service service = new ict2client.ICT2WebService_Service();
        ict2client.ICT2WebService port = service.getICT2WebServicePort();
        return port.safeDivide(x, y);
    } 
    
    
}
