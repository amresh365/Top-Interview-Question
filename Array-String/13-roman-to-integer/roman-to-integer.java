class Solution {
    public int romanToInt(String s) {
         Character symbol[]={'M','D','C','L','X','V','I'};
     int values[]={1000,500,100,50,10,5,1};
     int sum=0;
Map<Character,Integer>mp=new HashMap<>();
for(int i=0;i<symbol.length;i++){
mp.put(symbol[i],values[i]);
}

sum=mp.get(s.charAt(s.length()-1));
for(int i=s.length()-2;i>=0;i--)
{
    if(mp.get(s.charAt(i))<mp.get(s.charAt(i+1)))
    {
        sum=sum-mp.get(s.charAt(i));
    }
    else{
        sum=sum+mp.get(s.charAt(i));
    }

}
 return sum;
    }
}