import java.util.Scanner;

public class monthname {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weekday day number (1-12) : ");
        int monthnumber = scanner.nextInt();

        if(monthnumber == 1) {

            System.out.println("jan");

        } else if(monthnumber == 2) {

            System.out.println("feb");

        } else if(monthnumber== 3) {

            System.out.println("march");

        } else if(monthnumber == 4) {

            System.out.println("april");

        } else if(monthnumber == 5) {

            System.out.println("may");

        } else if(monthnumber == 6) {

            System.out.println("june");

        } else if(monthnumber == 7) {

            System.out.println("july");

        }
        else if(monthnumber == 8) {

            System.out.println("august");

        }else if(monthnumber == 9) {

            System.out.println("sep");

        }
        else if(monthnumber ==10) {

            System.out.println("oct");

        }
        else if(monthnumber ==11) {

            System.out.println("nov");

        }
        else if(monthnumber == 12) {

            System.out.println("dec");

        }else {

            System.out.println("Please enter weekday number between 1-7.");
        }

    }
}