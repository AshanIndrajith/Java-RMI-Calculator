package client;

import calc.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {

    public static void main(String[] args) {
        try {
            Registry myReg= LocateRegistry.getRegistry("localhost",54322);
            Calculator myCal=(Calculator) myReg.lookup("MyCalculatorServer");

            int add=myCal.addTwoNumbers(12,12);
            System.out.println("addition "+add);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
