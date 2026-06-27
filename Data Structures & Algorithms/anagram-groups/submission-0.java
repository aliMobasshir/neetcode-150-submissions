class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] isAdded = new boolean[strs.length];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i<strs.length; i++){
            if(isAdded[i] == true) continue;
            List<String> oneDone = new ArrayList<>();

            for(int j = i +1; j< strs.length; j++){
               

                if(isAnagram(strs[i],strs[j])){
                    oneDone.add(strs[j]);
                    isAdded[j] = true;
                }
            }
            oneDone.add(strs[i]);
            ans.add(oneDone);
        }
    return ans;
    }
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
