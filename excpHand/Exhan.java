package excpHand;

import java.util.Stack;

public class Exhan {

    public static void main(String[] args) throws Exception {
        try {
            int a = 2/0;

        }
        catch (Exception e){
          throw  new Exception(e.getMessage());
        }
        finally {
            System.out.println("tyis is final");
        }

        Stack f = new Stack();
    }
}
