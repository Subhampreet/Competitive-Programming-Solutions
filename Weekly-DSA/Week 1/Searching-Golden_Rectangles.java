import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.*;

import java.util.stream.IntStream;

 

class TestClass {

    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int c=0;

        for(int t=0;t<n;t++)

        {

            double a=sc.nextInt();

            double b=sc.nextInt();

            double ratio;

            

            if(a>b)

            {

                ratio=a/b;

                if(ratio>=1.6 && ratio<=1.7)

                {

                    c=c+1;

                }

            }

            else

            {

                ratio=b/a;

                

                if(ratio>=1.6 && ratio<=1.7)

                {

                    c=c+1;

                }

            }

        }

        System.out.println(c);

    }

}