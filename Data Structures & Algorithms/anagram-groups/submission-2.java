class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans = new ArrayList<>();

        Map<List<Integer>,List<String>> mp = new HashMap<>();

        for(int i = 0;i<strs.length; i++){
           
            int[] charArray = new int[26];
            String s = strs[i];
            for(int k = 0;k<s.length();k++){
                charArray[s.charAt(k) - 'a']++;
            }

            List<Integer> charList = new ArrayList<>();

            for(int el : charArray){
                charList.add(el);
            }

           if(!mp.containsKey(charList)){
            List<String> anagrams = new ArrayList<>();
            anagrams.add(s);
            mp.put(charList,anagrams);
           } else {
            mp.get(charList).add(s);
           }
        }

        for(List<String> value : mp.values()){
            ans.add(value);
        }
        return ans;
    }
}
