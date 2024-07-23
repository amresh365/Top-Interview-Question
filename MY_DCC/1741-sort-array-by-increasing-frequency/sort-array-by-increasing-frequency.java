class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        //Maping the frequency of numbers
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        //Creating a list with all nums
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
   // Here sorting the behalf of condition with the help of lambda Expression
        Collections.sort(numList, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a);
            }
        });
    //Here rearranging the numbers 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }

        return nums;
    }
}