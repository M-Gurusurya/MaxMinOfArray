import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=scanner.nextInt();
        int array[]=new int[size];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
            if(array[i]>max)
            {
                max=array[i];
            }
            else if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println(max+min);
    }
}
