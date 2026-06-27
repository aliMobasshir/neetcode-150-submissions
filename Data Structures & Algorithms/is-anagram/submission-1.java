class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
       int[] charArray = new int[26];


      for(int i = 0;i < s.length(); i++){
        char sch = s.charAt(i);
        char tch = t.charAt(i);
        int sindex = sch - 'a';
        int tindex = tch - 'a';
        charArray[sindex] = charArray[sindex] + 1;
        charArray[tindex] = charArray[tindex] - 1;
      }

      for(int el : charArray){
        if(el != 0) return false;
      } 
      return true;
    }
}
