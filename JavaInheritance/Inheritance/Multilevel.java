package JavaInheritance.Inheritance;

public class Multilevel {
    public void isMultiple(){
        System.out.println("yes");
    }
}

class Multilevel2 extends  Multilevel{
    public void isMultiple(){
        System.out.println("yes2");
    }
}

class Multilevel3 extends  Multilevel2{

    public void isMultiple(){
        System.out.println("yes2");
    }
}

//When there is a chain of inheritance, it is known as multilevel inheritance.