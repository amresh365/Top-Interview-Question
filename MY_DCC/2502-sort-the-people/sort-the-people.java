class Solution {  
    public String[] sortPeople(String[] names, int[] heights) {  
        // Create a list of pairs to hold names and heights  
        List<Person> people = new ArrayList<>();  
        
        // Create the list with names and heights  
        for (int i = 0; i < names.length; i++) {  
            people.add(new Person(names[i], heights[i]));  
        }  
        // Sort the people list based on their heights in descending order  
        people.sort((a, b) -> b.height - a.height);  
        
        // Extracting the sorted names into a result array  
        String[] sortedNames = new String[names.length];  
        for (int i = 0; i < names.length; i++) {  
            sortedNames[i] = people.get(i).name;  
        }  
        
        return sortedNames;  
    }  
    
    class Person {  
        String name;  
        int height;  
        
        Person(String name, int height) {  
            this.name = name;  
            this.height = height;  
        }  
    }  
}  