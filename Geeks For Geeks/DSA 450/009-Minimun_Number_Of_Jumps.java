








































Refresh

Time (IST)	Status	Lang	Test Cases	Code
2023-01-13 11:55:32	Correct	java	142 / 142	View
2023-01-13 11:55:11	Correct	java	142 / 142	View
2023-01-13 11:54:23	Time Limit Exceeded	java	141 / 142	View
2023-01-13 11:50:27	Wrong	java	1 / 142	View
2023-01-13 11:47:00	Wrong	java	1 / 142	View
2023-01-13 11:46:22	Wrong	java	1 / 142	View
2023-01-13 11:41:27	Wrong	java	32 / 142	View
2023-01-13 11:38:26	Wrong	java	2 / 142	View
Java (1.8)




Custom Input


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
         if(n == 1)
            return 0;

            

        if(arr[0] == 0)

            return -1;

            

        int maxreach = arr[0];

        int step = arr[0];

        int jump=1;

        

        for(int i=1;i<n;i++)

        {

            if(i == n-1)

                return jump;

            

            maxreach = Math.max(maxreach,i+arr[i]);

            step--;

            

            if(step==0)

            {

                jump++;

                if(i >= maxreach)

                    return -1;

                step = maxreach-i;

            }

        }

        return -1;
    }
}