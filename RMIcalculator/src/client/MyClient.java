package client;

import calc.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            Registry myReg= LocateRegistry.getRegistry("localhost",54321);
            Calculator myCal=(Calculator) myReg.lookup("MyCalculatorServer");


            int addition = myCal.addTwoIntegers(12,20);
            System.out.println("Addition of Two Numbers : "+addition);


        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }


    }


}
