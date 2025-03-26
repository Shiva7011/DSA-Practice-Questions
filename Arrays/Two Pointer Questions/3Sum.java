Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

  // Brute force approach
  class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n=arr.length;
        List<List<Integer>> res=new ArrayList<>();                      //here we create a list of list
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    List<Integer>list=new ArrayList<>();
                    if(arr[i]+arr[j]+arr[k]==0){
                        list.add(i);
                        list.add(j);
                        list.add(k);
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }
}

  // optimal approach using hashset
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>>result=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));      //  is used to add a triplet (three numbers) to the result
                    left++;
                    right--;
                } else if(sum<0)
                  left++;
                  else
                   right--;
            }
        }
        return new ArrayList<>(result);               // here result is a hashset so first we convert it to new arrayList then return.
    }
}
