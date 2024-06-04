class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map=new HashMap<>();
         int cha=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
       for(Map.Entry<Character,Integer>e : map.entrySet()){
         if(e.getValue()%2!=0){
           cha++;
           }
       }
       if(cha>0)
       {
        return s.length()-cha+1;
       }else{
        return s.length();
       }
    }
}




// Create a HashMap to store the frequency of each character in the string.
// Iterate over the characters in the input string and update the frequency count in the HashMap.
// Determine the middle character of the palindrome.
// Construct the first half of the palindrome by appending characters with even frequencies.
// Construct the second half of the palindrome by reversing the first half.
// If a middle character exists, add it between the first and second halves of the palindrome.