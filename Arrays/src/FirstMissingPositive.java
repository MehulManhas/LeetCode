public class FirstMissingPositive {
    int posStart = 0;
    int posIndex = 0;
    public FirstMissingPositive(){}

    public int firstMissingPositive(int[] nums) {
        //[3,4,-1,1]
        //[1,4,-1,3]
        //[1,3,-1,4]
        //[-1,3,1,4]

        //[-1,4,3,1]
        //[-1,1,3,4]

        //[1,2,0]




        return -1;
    }

    public int calculateFirstMissing(int[] nums){

        moveNegatives(nums);

        movePositives(nums);



        return -1;
    }
    public void swap(int[] nums, int i, int posStart){
        int temp = nums[i];
        nums[i] = nums[posStart];
        nums[posStart] = temp;
    }

    public void moveNegatives(int[] nums){

        posStart = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= 0){
                swap(nums, i, posStart);
                posStart++;
            }
        }

        for(int i : nums){
            System.out.print(i + " ");
        }
        posIndex = posStart;
        System.out.println(posStart);
    }

    public void movePositives(int[] nums){
        int end = nums.length-1;
        int start = posStart;
        while (start < nums.length){
            if(nums[start] > nums[end]){
                swap(nums, start, end);
                end--;
            }
            else if(nums[start] <= nums[end]){
                start++;
            }
        }

        for(int i : nums){
            System.out.print(i + " ");
        }
    }

    public void findFirstPos(int[] nums){

    }

    public void setPositives(int[] nums){

        int start = 0;
        int outOfBoundIdx = posIndex;
        int end = posIndex;
        if(posIndex > 0){
            end = nums.length-1;
        }

        while(posIndex < nums.length){
            if(nums[start] <=0){
                if(nums[posIndex] < nums.length && nums[posIndex] < posIndex){
                    swap(nums, start, posIndex);
                }
                else if(nums[posIndex] > nums.length && ){
                    swap(nums, start, );
                }
            }

        }
    }
}
