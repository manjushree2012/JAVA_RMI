package rmi;

import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements AddI
{
    public AddC() throws Exception
    {
        super();
    }
    //test commit 
    public int add(int x, int y)
    {
        return x+y;
    }

}
