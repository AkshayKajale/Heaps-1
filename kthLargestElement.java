/*Time Complexity: O(nlogk)
Space Complexity: O(n)*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            priorityQueue.add(nums[i]);
            if(priorityQueue.size()>k)
                priorityQueue.remove();
        }
        return priorityQueue.remove();
    }
}
