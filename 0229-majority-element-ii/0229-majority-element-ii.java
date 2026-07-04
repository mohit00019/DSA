class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> a=new HashMap<>();
        for(int num : nums){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        List<Integer> ans= new ArrayList<>();
        for(int key: a.keySet()){
            if(a.get(key) > nums.length / 3){
                ans.add(key);
            }
        }
        return ans;
    }
}