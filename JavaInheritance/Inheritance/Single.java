package JavaInheritance.Inheritance;

public class Single {

    public void func(){
        System.out.println("Single JavaInheritance.Inheritance");
    }
}

class SubSingle extends  Single{

    public void funcSub(){
        System.out.println("Single JavaInheritance.Inheritance sub");
    }

    public static void main(String[] args) {
        SubSingle obj = new SubSingle();

        obj.func();
        obj.funcSub();
    }
}


//when a class inherits another class is Single JavaInheritance.Inheritance.
// SubSingle class inherits Single class.


