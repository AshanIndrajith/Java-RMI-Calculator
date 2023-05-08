package server;

import calc.Calculator;
import calc.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {

    public static void main(String[] args) {


        try {
            Registry myReg= LocateRegistry.createRegistry(54321);
            Calculator myCal= new MyCalculator();

            myReg.rebind("MyCalculatorServer",myCal);
            System.out.println("My Calculator Server is Running...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
