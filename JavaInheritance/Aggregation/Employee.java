package JavaInheritance.Aggregation;

public class Employee {
    String name;
    Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void printEmp(){
        System.out.println("name: " + name +'\n'+ address.toString());

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("kushal", new Address("Blr", "KA"));
        emp1.printEmp();
    }


}

class Address{
    String city;
    String state;

    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "city: " + city + '\n' +"state: " + state;
    }
}