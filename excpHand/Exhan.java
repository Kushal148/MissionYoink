package excpHand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Stack;

public class Exhan {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 2/2;
            throw  new Exception();
        }
        catch (Exception e){

        }
        finally {
            System.out.println("tyis is final");
        }

        Stack f = new Stack();

        FileInputStream GFG
                = new FileInputStream("/Desktop/GFG.txt");


    }
}
