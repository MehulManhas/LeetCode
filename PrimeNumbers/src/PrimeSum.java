public class PrimeSum {

    public int[] primesum(int A) {

        // This below code is for Sieve of Eratosthenes code standard code.

        int ar[]=new int[A+1];
        ar[0]=1;
        ar[1]=1;
        for(int i=2;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                for(int j=2*i;j<ar.length;j+=i)
                {
                    ar[j]=1;
                }
            }
        }
        // This ans array will have exact 2 value which is combination of matching pair
        int ans[]=new int[2];

        // This below code will tavell from i=2 to A-i like from front and back which will check if any pair from
        // Sieve have 0 in it
        // eg:A=8 // 012345678
        // 110010101
        /* we need to check if pair has zero in it
        if it has we will add i and A-i then if that is equal to A then we can say thin is first pair
        */
        for(int i=2;i<A;i++)
        {
            int a=ar[i];
            int b=ar[A-i];
            if(a==0 && b==0)
            {
                int add=i+(A-i);
                if(add==A)
                {
                    ans[1]=i;
                    ans[0]=A-i;
                }
            }
        }
        return ans;
    }
}
