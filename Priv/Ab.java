package Priv;

public class Ab {

    int k = 2;
    Ab(){
         k = 7;

        System.out.println("Ab");
    }

    public static void main(String[] args) {
        BC c = BC.ss();
        System.out.println(c.k);
        String myltiline = """
                 i have no format
                asdv 
                asfasf 
                5534  "sdfasf"
                """;

        Float k = Float.valueOf(1__1__1___0-0);
        System.out.println(k);

    }


}


class BC extends Ab{
    int a = 1;

    private BC(){
        System.out.println("BC");
    }
    public static BC ss(){
       return  new BC();
    }
}