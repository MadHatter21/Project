import java.util.Scanner;
public class Main
{
    public static int SquareSum(int a[],int size) 
    {
        int sum=0;
        int square=0;
    
        for(int i=0;i<size;i++)
        {
            square=a[i]*a[i];
            sum=sum+square;
        }
        
        return sum;
    }

    public static void main(String[] args) 
    {
        int j=0;
        
        int[] arr=new int[10];
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size");
        int size=sc.nextInt();
         
        System.out.println("enter element");
        for(int i=0;i<size;i++)
              arr[i]=sc.nextInt();
        
        System.out.print("square sum of element "+SquareSum(arr,size));
     }
}
