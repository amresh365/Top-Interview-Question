class Solution {
    public int numRescueBoats(int[] people, int limit) {
          Arrays.sort(people); // Sort the people array to simplify the process
        int boatCount = 0;
        int i = 0;
        int j = people.length - 1; // Start j from the end of the array

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // If both can fit, move to the next person
            }
            j--; // Move to a smaller person in any case
            boatCount++; // Increment boat count as we are using a boat
        }

        return boatCount;
    }
}