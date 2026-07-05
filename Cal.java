import java.util.ArrayList;
import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("""
                Please select option
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Modulus
                """);

        int opt = sc.nextInt();

        switch(opt){
            case 1:
                add(sc);
                break;

            case 2:
                sub(sc);
                break;

            case 3:
                mul(sc);
                break;

            case 4:
                div(sc);
                break;

            case 5:
                mod(sc);
                break;

            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }

    public static ArrayList<Integer> input(Scanner sc){

        ArrayList<Integer> arr = new ArrayList<>();

        while(true){

            System.out.println("Enter number (-1 to stop)");

            int val = sc.nextInt();

            if(val==-1){
                break;
            }

            arr.add(val);
        }

        return arr;
    }

    public static void add(Scanner sc){

        ArrayList<Integer> arr = input(sc);

        int sum = 0;

        for(int i=0;i<arr.size();i++){
            sum += arr.get(i);
        }

        System.out.println("Result = "+sum);
    }

    public static void sub(Scanner sc){

        ArrayList<Integer> arr = input(sc);

        if(arr.size()==0){
            System.out.println("No numbers");
            return;
        }

        int sub = arr.get(0);

        for(int i=1;i<arr.size();i++){
            sub -= arr.get(i);
        }

        System.out.println("Result = "+sub);
    }

    public static void mul(Scanner sc){

        ArrayList<Integer> arr = input(sc);

        int mul = 1;

        for(int i=0;i<arr.size();i++){
            mul *= arr.get(i);
        }

        System.out.println("Result = "+mul);
    }

    public static void div(Scanner sc){

        ArrayList<Integer> arr = input(sc);

        if(arr.size()==0){
            System.out.println("No numbers");
            return;
        }

        double div = arr.get(0);

        for(int i=1;i<arr.size();i++){

            if(arr.get(i)==0){
                System.out.println("Cannot divide by zero");
                return;
            }

            div /= arr.get(i);
        }

        System.out.println("Result = "+div);
    }

    public static void mod(Scanner sc){

        ArrayList<Integer> arr = input(sc);

        if(arr.size()==0){
            System.out.println("No numbers");
            return;
        }

        int mod = arr.get(0);

        for(int i=1;i<arr.size();i++){

            if(arr.get(i)==0){
                System.out.println("Cannot modulo by zero");
                return;
            }

            mod %= arr.get(i);
        }

        System.out.println("Result = "+mod);
    }
}
