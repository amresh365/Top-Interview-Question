class Solution {  
    public static int[] merge(int arr1[], int arr2[]) {  
        int combined[] = new int[arr1.length + arr2.length];  
        int index = 0;  
        int i = 0;  
        int j = 0;  

        // Merge both arrays  
        while (i < arr1.length && j < arr2.length) {  
            if (arr1[i] < arr2[j]) {  
                combined[index] = arr1[i];  
                i++;  
            } else {  
                combined[index] = arr2[j];  
                j++;  
            }  
            index++;  
        }  

        // Append remaining elements from arr1  
        while (i < arr1.length) {  
            combined[index] = arr1[i];  
            index++;  
            i++;  
        }  

        // Append remaining elements from arr2  
        while (j < arr2.length) {  
            combined[index] = arr2[j];  
            index++;  
            j++;  
        }  

        return combined;  
    }  

    public static int[] sortArray(int arr[]) {  
        if (arr.length == 1) {  
            return arr;  
        }  
        int midindex = arr.length / 2;  
        int left[] = sortArray(Arrays.copyOfRange(arr, 0, midindex));  
        int right[] = sortArray(Arrays.copyOfRange(arr, midindex, arr.length));  
        return merge(left, right);  
    }  
}  