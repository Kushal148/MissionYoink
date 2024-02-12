package JavaInheritance.Inheritance;

public class Hierarchical {
    public void foo(){
        System.out.println("Hierarchical inheritance");
    }
}

class SubherarA extends  Hierarchical{
    public void foo(){
        System.out.println("Hierarchical inheritance A");
    }
}

class SubherarB extends  Hierarchical {
    public void foo() {
        System.out.println("Hierarchical inheritance B");
    }
}


class ExeMain{
    public static void main(String[] args) {
        Hierarchical objA = new SubherarA();
        objA.foo();

        objA = new SubherarA();
        objA.foo();

        objA = new SubherarB();
        objA.foo();

    }
}

//When two or more classes inherits a single class, it is known as hierarchical inheritance.