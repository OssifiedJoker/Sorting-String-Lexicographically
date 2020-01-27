import java.util.*;
class bstring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextLine();
       /* boolean ch=check(str,st);
        System.out.println(ch);*/
       /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(check(arr[j],arr[j+1])==false)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    public static boolean check(String str1, String str2)
    {
        int i=0,j=0;
        boolean res=true;
        while(i<str1.length() && j<str2.length())
        {
            if(str1.charAt(i)<str2.charAt(j))
            {
            res=true;
            break;
            }
            else if(str1.charAt(i)>str2.charAt(j))
            {
            res=false;
            break;
            }
            if(i<=j)
            res=false;
            i++;
            j++;
        }
        return res;
    }
}