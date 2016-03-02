/*
Author: Kahan Prabhu
Email: kprabhu@ncsu.edu
This program successfully checks if two strings are anagrams to each other.
*/

import java.util.*;
import java.io.*;
public class Anagram
{
    
    public static void main()throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string 1");
        String s1= in.readLine();
        System.out.println("Enter string 2");
        String s2= in.readLine();
        
        boolean outcome = check(s1,s2);
        if(outcome)
            System.out.println("The strings are indeed Anagrams");
        
        else
            System.out.println("The strings aren't Anagrams");
        
        
    }
    
    
    static boolean check(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        
        else
        {
            
        char arr1[]= new char[s1.length()];
        char arr2[]= new char[s2.length()];
        //sorting the string
        for(int i=0; i<s1.length();i++)
        {
            arr1[i]= s1.charAt(i);
            arr2[i]= s2.charAt(i);
            
        }
        
         
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String f1=new String(arr1);
        String f2=new String(arr2);
       
        return (f1.equals(f2));
    }
    
    
    }
    
  
}
