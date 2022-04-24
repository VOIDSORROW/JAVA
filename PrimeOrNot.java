import java.util.Scanner;
public class PrimeOrNot{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=input.nextInt();
        boolean prime=true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                prime=false;
                break;
            }
        }if(prime==true){
            System.out.println("The Entered Number "+x+" is a Prime...");
        }else
            System.out.println("The entered number is not a prime number...");
        input.close();
    }
}