class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> mp = new HashMap<>();
        
     for(int i = 0; i< strs.length; i++){
        List<String> list = new ArrayList<>();

//sorting string
        String s = strs[i];
        char[] sortedArray = s.toCharArray();
        Arrays.sort(sortedArray);
        String sorted = new String(sortedArray);

        if(!mp.containsKey(sorted)){
            list.add(strs[i]);
            mp.put(sorted,list);
        }
        else{
            mp.get(sorted).add(strs[i]);
        }
     }

     for(List<String> value : mp.values()){
    ans.add(value);
     }

     return ans;
    }
}
