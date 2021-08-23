import java.util.*;

class TestClass {

    public static int hexSum(int num){

        String s= Integer.toHexString(num);
        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                sum+= Integer.parseInt(String.valueOf(c));
            }
            else
            {
                sum+=Integer.parseInt(String.valueOf(c),16);
            }
        }
        return sum;
    }


    public static int gcd(int x, int y)
    {
        if(y==0) return x;
        return gcd(y,x%y);
    }

    

    public static void main(String args[] ) throws Exception {   

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int l = sc.nextInt();

            int r = sc.nextInt();

            int count=0;

            for(int i=l;i<=r;i++)
            {
                int tot = hexSum(i);
                if(gcd(i,tot)>1)
                    count++;

            }
            System.out.println(count);

        }
    }
}