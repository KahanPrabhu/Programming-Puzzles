/*
Author: Kahan Prabhu
Email: kprabhu@ncsu.edu
About the program:
This program successfully generates all possible combinations of a number.
Example:
123 becomes 123, 132, 213, 231, 312, 321.
*/
import java.util.*;
import java.io.*;
public class Permutation
{
    
   public static void main()throws IOException
   {
       LinkedList list=new LinkedList();
       
       BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number");
       int num= Integer.parseInt(in.readLine());
       int count= (String.valueOf(num)).length();
       
       while(num!=0)
       {
          int temp=0;
          temp =(int)(num/Math.pow(10,count-1));
          list.add(temp);
          num=(int)(num%Math.pow(10,count-1));
          count--;
        }
       
    
    LinkedList ans= permute(list);
    System.out.println(ans.size());
    System.out.println(ans);
    }
    
    
    
    
    
    
    
    static LinkedList permute(LinkedList list)
    {
        
        if(list.size() == 1)
        {
          LinkedList answer =new LinkedList();  
          answer.add(list.get(0));
          return answer;
            
        }
        
        else if(list.size()== 2)
        {
            
            LinkedList answer =new LinkedList();
            
            answer.add(String.valueOf(list.get(0))+String.valueOf(list.get(1)));
            answer.add(String.valueOf(list.get(1))+String.valueOf(list.get(0)));
            
            return answer;
            
        }
        
        else if(list.size()>=3)
        {
        LinkedList answer =new LinkedList();    
        int last = (int)(list.get(list.size()-1));
        
        list.pollLast();
        
        LinkedList list1= permute(list);
        
        
        for(int j=0;j<list1.size();j++)
        {
	        String temp = String.valueOf(list1.get(j));
	        
	        answer.add(String.valueOf(last)+temp);
            for(int i=0;i<temp.length();i++)
                {
                    
                    answer.add(String.valueOf(temp.substring(0,i+1))+String.valueOf(last)+String.valueOf(temp.substring(i+1,temp.length())));
                    
                }
                
            
	        }
 
        
         return answer;
        
        }
        
       else 
       {
           LinkedList i=new LinkedList();
           
       return i;
    }
        
    }
   
}



















