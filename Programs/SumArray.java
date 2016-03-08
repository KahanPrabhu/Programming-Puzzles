/*
Author: Kahan Prabhu
Email: kprabhu@ncsu.edu
Description: This program returns the pairs of elements in an array which total up to a pre-specified sum. 
For example, for the array {3, 4, 5, 6, 15, 18, 20} and the prespecified sum = 23, the pairs will be (5,18) and (3,20).

*/
import java.io.*;
public class SumArray
{
    static int arr[];
    public static void main()throws IOException
    {
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array length");
        int n=Integer.parseInt(in.readLine());
        arr=new int[n];
        System.out.println("Enter the elements of the array");
        
        for(int i=0; i<n; i++)
        {
            arr[i]= Integer.parseInt(in.readLine());
            
        }
       
        System.out.println("Enter the value of the sum");
        int sum = Integer.parseInt(in.readLine());
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            }
        
 
        int anchor = (int)(sum/2);
        int u=findClosest(anchor);
      
            
        
        System.out.println("The pairs that sum up to "+sum+" are : ");
        
        for(int i=u; i<arr.length;i++)
        {
            for(int j=u-1;j>=0;j--)
            {
                if(arr[i]+arr[j]== sum)
                {
                    System.out.println(arr[i]+", "+arr[j]);
                }
            }
        }
   
    }
    
    static int findClosest(int value)
    {
        int index=0;
       int base= Math.abs(arr[0]-value); 
        for(int i=1;i<arr.length;i++)
        {
            if(Math.abs(arr[i]- value)<base)
            {
                base =Math.abs(arr[i]-value); index= i;
            }
        }
        
        return index;
        
    }
    
    
    
}
