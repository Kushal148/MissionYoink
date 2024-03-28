package reflection;

import java.lang.reflect.Method;

public class Reff {

    public static void main(String[] args) throws ClassNotFoundException {

        Class s = Class.forName("reflection.Reff2");
        Method[] ass = s.getMethods();
        System.out.println(ass[0]);
    }
}

class Reff2{
    int a ;

    public void ss(){

    }
}
