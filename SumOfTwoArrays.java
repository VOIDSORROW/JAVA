import java.util.Scanner;
public class SumOfTwoArrays {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of elements to be stored in the arrays: ");
        int n=input.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=input.nextInt();
        }
        int arr2[]=new int[n];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=input.nextInt();
        }
        int sumarray[]=new int[n];
       for(int i=0;i<=sumarray.length;i++){
            sumarray[i]=arr1[i]+arr2[i];
        }
        for(int i=0;i<=sumarray.length;i++){
            System.out.println(sumarray[i]+" ");
        }
        input.close();
    }
}
