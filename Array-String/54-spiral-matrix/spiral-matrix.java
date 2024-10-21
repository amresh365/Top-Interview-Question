class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
    List<Integer>list=new ArrayList<>();
	int cStart=0;
	int rEnd=arr.length-1;
	int rStart=0;
	int cEnd=arr[0].length-1;
	while(rStart <= rEnd && cStart<= cEnd) {
		//Traverse Right
		for(int i=cStart;i<=cEnd;i++) {
            list.add(arr[rStart][i]);
		}
		// rs row updation  
		rStart++;
		//Traverse Down
         for(int i=rStart;i<=rEnd;i++) {
               list.add(arr[i][cEnd]);	
		}
     	//ce col updation
         cEnd--;	
         //Traverse left
         if(rStart<=rEnd){
         for(int i=cEnd;i>=cStart;i--) {
               list.add(arr[rEnd][i]);
 		}
         }
      //re row end updation
    	 rEnd--;
      //Traverse up
      if(cStart<=cEnd){
         for(int i=rEnd;i>=rStart;i--) {
               list.add(arr[i][cStart]);
 		}
      }
       //updation of col start 
			cStart++;
	}
     return list;
    }
}