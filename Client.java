package rmi;

import java.rmi.Naming;

public class Client {
    public static void main(String a[]) throws Exception
    {
        AddI obj = (AddI) Naming.lookup("ADD");

        int n = obj.add(2, 3);

        System.out.println("Addition is " + n);
    }
}
