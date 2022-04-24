import java.util.Scanner;
public class AverageOfAnArray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of elements to be stored: ");
        int n=input.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter "+n+" of elements to be stored: ");
        int sum=0;
        for(int i=0;i<n;i++){
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
        System.out.println("The average of the numbers stored in the array is: "+sum/n);
        input.close();
    }
}
