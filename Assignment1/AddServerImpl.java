import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf {

    public AddServerImpl() throws RemoteException {}

    @Override
    public double add(double d1, double d2) throws RemoteException {        
        return (d1 + d2);
    }
    
}
