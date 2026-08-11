class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);
        find(candidates, target,0, new ArrayList<>(),ans);
        return ans;
    }
    static void find(int[] candidates, int target, int index, 
    ArrayList<Integer> list,
     List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i<candidates.length; i++){
            
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted
            if (candidates[i] > target) {
                break;
            }

            // Choose
            list.add(candidates[i]);

            // i + 1 because each element can be used only once
            find(candidates, target - candidates[i],
                      i + 1, list, ans);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }
}
        
    

        
    