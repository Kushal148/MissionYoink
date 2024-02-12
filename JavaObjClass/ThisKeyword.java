package JavaObjClass;

public class ThisKeyword {

    public ThisKeyword() {
    }

    ThisKeyword getThisA() {
        return this;
    }

    void print(){

    }

    public static void main(String[] args) {
        new  ThisKeyword().getThisA().print();

        new ThisKeyword().getClass();
    }
}

