public class PalindromicSubstringCount {
 
 	public static int palindromicCount(String s){
 		int count=0,n=s.length();
 
 		for (int i = 0; i < n; i++) {
 			count += expandFromCenter(s, i, i);     
 			count += expandFromCenter(s, i, i + 1); 
 		}
 
 		return count;
 	}
 	
 	private static int expandFromCenter(String s, int left, int right) {
         int count = 0;
         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
             count++;  
             left--;
             right++;
         }
         return count;
     } 
 
 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 
 		String s="abc";
 		System.out.println(palindromicCount(s));
 	}
 
 }
