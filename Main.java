public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci numbers");



        int f=0;


        int n3=0;
        int n2=1;
        int n1=0;

        System.out.println(n1);
        System.out.println(n2);
        n3 = n1+ +n2;
        System.out.println(n3);


        do {
            f++;
            /*
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
             */
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.println(n3);
        }
        while(f<6);
    }
}