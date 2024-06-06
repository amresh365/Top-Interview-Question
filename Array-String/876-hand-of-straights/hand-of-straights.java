class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
         if(hand.length % groupSize != 0) {
            return false;
        }
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int card : hand) {
            freqMap.put(card, freqMap.getOrDefault(card, 0) + 1);
        }
        
        Arrays.sort(hand);
        
        for(int card : hand) {
            if(freqMap.get(card) == 0) {
                continue;
            }
            
            for(int i = 0; i < groupSize; i++) {
                if(freqMap.getOrDefault(card + i, 0) == 0) {
                    return false;
                }
                freqMap.put(card + i, freqMap.get(card + i) - 1);
            }
        }
        
        for(int count : freqMap.values()) {
            if(count != 0) {
                return false;
            }
        }
        
        return true;
    }
}