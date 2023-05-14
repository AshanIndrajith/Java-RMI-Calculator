package calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

    public int addTwoNumbers(int x,int y) throws RemoteException;

}
