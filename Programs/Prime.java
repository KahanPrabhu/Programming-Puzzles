import java.io.*;
public class Prime
{
    public static void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n=Integer.parseInt(in.readLine());
        
        int flag=1;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {flag=0;break;}
          
        }
        
        if(flag==0)
        {System.out.println("Number is not prime.");
        }
        else
        {
            System.out.println("Number is prime.");
        }
        
    }
    
    
}