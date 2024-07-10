class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
           //Here we cheak if last digit in digits <9 the we add by one same and return the digits
  	          if (digits[i] < 9) {
		      digits[i]++;
		      return digits;
	          }
	        digits[i] = 0;
         }
      //This is the condition when our digits size Increse By one
      digits = new int[digits.length + 1];
      digits[0] = 1;
      return digits;
    }
}