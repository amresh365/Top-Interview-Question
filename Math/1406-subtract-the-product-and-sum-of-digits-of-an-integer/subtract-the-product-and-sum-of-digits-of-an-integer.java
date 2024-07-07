class Solution {
    public int subtractProductAndSum(int n) {
        int p;
  p=digp(n);
int s=digit(n);
return (p-s);

    }
    public int digit(int n)
    {
        int sum=0;
    while(n!=0)
    {
    sum= sum+n%10;
    n=n/10;
    }
return sum;
    }

public int digp(int n)
{   
    int pr=1;
while(n!=0)
{
    pr=pr*(n%10);
    n=n/10;
}
return pr; 
    }
}