package nix_solutions;

public class Main {

    public static void main(String[] args) {
        int a = 347693485;
        int i;
        int x;
        for ( i = 0; i < 9; i++) {
            x =a % 10;
            a = a / 10;
            if (x % 2 == 0 && x % 3 == 0){
                System.out.println("fizzbuzz");
            }
            else  if (x % 2 == 0){
                System.out.println("fizz");
            }
            else if (x % 3 == 0){
                System.out.println("buzz");
            }

            else{
                System.out.println(x);
            }
        }

    }
}
