class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int count=0;
        for(int n:nums){
            if(a.containsKey(n)){
                count=count+a.get(n);
            }
            a.put(n,a.getOrDefault(n,0)+1);
        }
        return count;


    }
}