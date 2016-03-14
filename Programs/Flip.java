import java.io.*;
public class Flip
{
    public static void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of the string.");
        String str=in.readLine();
        String newString="";
        for(int i=str.length()-1; i>=0; i--)
        {
            newString+=str.charAt(i);
        }
        
        
        System.out.println("The string when reversed is as follows:");
        
       System.out.println(newString);
        
    }
    
    
    
}