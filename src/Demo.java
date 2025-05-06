public class Demo {
    public static void main(String[] args) {
        int  nums[] = {5,7,9,11,13};
        int target = 11;

        int result = BinarySearch(nums, target);
        int result2 = linearSearch(nums, target);


        if(result != -1){
            System.out.println("Element found at Index : " + result);
            System.out.println("Element found at Index : " + result2);
        }else {
            System.out.println("Element found at Index");
        }
    }


    public  static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i = 0; i <nums.length; i++){
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear : " + steps);
                return i;

            }
        }
        System.out.println("Steps taken by Linear : " + steps);
        return -1;
    }

    public  static int BinarySearch(int[] nums, int target) {

        int steps = 0;
       int left = 0;
       int right = nums.length-1;

       while (left <= right){
           int mid = (left + right)/2;
            steps++;
           if(nums[mid] == target){
               System.out.println("Steps taken by Binary : " + steps);
               return mid;
           }  else if(nums[mid] < target){
               left = mid + 1;
           }
           else {
               right = mid - 1;
           }

       }
        System.out.println("Steps taken by Binary : " + steps);
        return -1;
    }
}

