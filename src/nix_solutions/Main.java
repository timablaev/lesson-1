package nix_solutions;

public class Main {

    public static void main(String[] args) {
        String str = "347693485";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
        int a = Integer.parseInt (reverse);
        System.out.println(a);
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
