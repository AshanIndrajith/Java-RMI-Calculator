package calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    public int addTwoIntegers(int x, int y) throws RemoteException;

    public int SubTwoIntegers(int x,int y) throws RemoteException;




}


