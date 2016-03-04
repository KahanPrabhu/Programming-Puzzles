import java.io.*;
public class Brackets
{
    
    public static void main()throws IOException
    {   int result=1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the expression.");
        String str=in.readLine();
        
        char brackets[] ={'(','{','[',']','}',')'};
        int c=0;
        
        
        for(int i=0;i<brackets.length;i++)
        {
            if(brackets[i]== '{' || brackets[i]== '(' || brackets[i]== '[')
                c++;
        }
        int u=0, v=0;
            for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)== '{' || str.charAt(i)== '(' || str.charAt(i)== '[')
                u++;
            
            if(str.charAt(i)== ')' || str.charAt(i)== '}' || str.charAt(i)== ']')
                v++;
        }
        
        int m1=0;int m2=0;
        
        if(u!=v)
        {System.out.println("This is not a proper expression.");
        }
        
        else{
            if(u+v==2)
            {
           
                
                for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)== '{' || str.charAt(i)== '(' || str.charAt(i)== '[')
                m1=i;
            
            if(str.charAt(i)== ')' || str.charAt(i)== '}' || str.charAt(i)== ']')
                m2=i;
        }
                
                
        if(check(m1,m2,str,brackets)==1)
        System.out.println("Proper Expression.");
        
        else
        System.out.println("Not a proper expression.");
        
  
                
            }
        
           else if(u+v==4)
            {
                for(int i=0;i<c-1;i++)
        {   
                int a[]=process(str, brackets);
                result=result*a[2];
                StringBuffer sb=new StringBuffer(str);
                
                sb.deleteCharAt(a[0]);
                
                sb.deleteCharAt(a[1]-1);
                
                str=String.valueOf(sb);
                
                
        }
            }
        
         else
         {
            
        for(int i=0;i<c;i++)
        {   
                int a[]=process(str, brackets);
                result=result*a[2];
                StringBuffer sb=new StringBuffer(str);
                
                sb.deleteCharAt(a[0]);
                
                sb.deleteCharAt(a[1]-1);
                
                str=String.valueOf(sb);
                
                
        }
    }
        
    
    if(!(u+v==2))
    {
        if(result==0)
        System.out.println("Not a correct expression.");
        
        else 
        System.out.println("The expression is correct. ");
        
    }
    
    }
    
    
    
        }
    
    static int[] process(String str, char brackets[])
    {
        
        int parameters[]={0,0,0};
        
        int lastOpen = LastOpen(str,str.length());
       
        
        int nextClose=NextClose(str, lastOpen);
        
        parameters[0]=lastOpen;
        parameters[1]=nextClose;
        
        parameters[2]= check(lastOpen, nextClose, str, brackets);
        
        return parameters;
    }
    
        
        
        
        
        
          static int check(int lo, int nc, String str, char[] arr)
    {
        
        char p1='a'; char p2='a';
        
        p1=str.charAt(lo);
        
        p2=str.charAt(nc);
        
        
      
        
        int l1=0; int l2=0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == p1) {
                l1=i;
                break;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == p2) {
                l2=i;
                break;
            }
        }
        
        if(l1+l2==5)
        return 1;
        
        else return 0;
        
    }
    
    
    
    
    
    static int LastOpen(String str, int k)
    {
        int index=0;
        for(int i=0;i<k;i++)
        {
            if(str.charAt(i)== '(' || str.charAt(i)== '{' || str.charAt(i)== '[')
                {
                    index=i;
                    
                    
                }
            
        }
        return index;
    }
    
    
    
    
    static int NextClose(String str, int k)
    {
        
        int flag=0;
        for(int i=k;i<str.length();i++)
        {
            if(str.charAt(i)==']' || str.charAt(i)=='}' ||str.charAt(i)==')')
            {
                flag= i;break;
            }
            
           
        }
        
        return flag;
        
    }
}
        
   
    
    
    
    
    
  