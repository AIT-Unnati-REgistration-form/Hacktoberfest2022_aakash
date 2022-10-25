import java.util.*;
class emirp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,d,n1=0,c=0,c1=0,i,j;
        System.out.println("Enter a number");
        n=sc.nextInt();
        m=n;
        while(m>0)
        {
            d=m%10;
            n1=n1*10+d;
            m/=10;
        }
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        for(j=2;j<=n1;j++)
        {
            if(n1%j==0)
            c1++;
        }
        if(c==c1)
        System.out.println("Emirp number");
        else
        System.out.println("Not emirp number");
    }
}