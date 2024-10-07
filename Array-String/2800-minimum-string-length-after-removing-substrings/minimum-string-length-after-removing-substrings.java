class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
       
            for (int i = 0; i < sb.length() - 1; ) {  
            if (sb.substring(i, i + 2).equals("AB") || sb.substring(i, i + 2).equals("CD")) {  
                sb.delete(i, i + 2);  
                // Do not increment i; instead check the same index again after deletion  
                // But if i is at the start, we don't need to go back  
                if (i > 0) {  
                    i--; // Go back one index to re-check the previous position  
                }  
            } else {  
                i++; // Only increment if no deletion was made  
            }  
        }  
        return sb.length();
    }
}




















// int j=0;
//             while(j!=sb.length())
//             { 
//               if(j>=sb.length())
//               {
//                 break;
//               }  
//              if(sb.substring(j,j+2).equals("AB"))
//              {
//                 sb.delete(j,j+2);
//              }else if(sb.substring(j,j+2).equals("CD"))
//              {
//                 sb.delete(j,j+2);
//              }
//              j++;
//             }