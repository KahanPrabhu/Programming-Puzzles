/*
Author: Kahan Prabhu
Email Id: kprabhu@ncsu.edu
About the program: Assume you have a method isSubstring which checks if one word is a substring of
another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
*/
import java.io.*;
public class Rotation
{
    public static void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string 1");
        String s1= in.readLine();
        System.out.println("Enter string 2");
        String s2= in.readLine();
        
        System.out.println("S2 is a substring of S1 even after rotation? Answer: "+isSubstring(s1, s2));
    }
    
    
    static boolean isSubstring(String s1, String s2)
    {
        
        String temp = s2+s2;
        System.out.println("Value of temp ="+temp);
        int flag=0;
        boolean choice=false;
        if(temp.contains(s1))
        {
            for(int i=0;i<temp.length()-s1.length();i++)
            {
                System.out.println(temp.substring(i,i+s1.length()));
                if(String.valueOf(temp.substring(i,i+s1.length())).equals(s1))
                {
                    System.out.println("Inside If case");
                    flag=i; break;
                }
                
            }
            
            String str=String.valueOf(temp.substring(flag+s1.length(),temp.length()))+String.valueOf(temp.substring(0,flag));
            
            if(str.equals(s1))
            {
                choice=true;
            }
            
        }
        
        
        return choice;
        
    }
    
    
}
