class Solution {
    public int diagonalPrime(int[][] nums) {
          List <Integer>l1=new ArrayList<>();

for(int i=0;i<nums.length;i++)
{
    l1.add(nums[i][i]);
    l1.add(nums[i][nums.length-i-1]);
}

Collections.sort(l1, Collections.reverseOrder());

for(int i=0;i<l1.size();i++)
{
    if(isPrime(l1.get(i)))
    {
        return l1.get(i);
    }
}
  return 0;   
        }

        public static boolean isPrime(int n) {  
       if(n==1) return false;
            if (n==2) return true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0) return false;
            }
            return true;
    }
}