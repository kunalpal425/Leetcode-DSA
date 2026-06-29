class Solution {
    public boolean numsHashCount(int num) {
        int digitcount=0;
        while(num!=0){
            num = num/10;
            digitcount++;
        }
        return digitcount%2==0;

    }
    public int findNumbers(int[] nums) {
        int eventcount=0;
        for(int i=0; i<nums.length; i++){
            if(numsHashCount(nums[i])){
                eventcount++;
            }
        }


        return eventcount;
        
    }
}