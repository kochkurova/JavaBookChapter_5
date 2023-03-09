public class MinMax {
    public static void main (String args []) {
        int nums [] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -100;
        nums[2] = 88;
        nums[3] = 33;
        nums[4] = -144;
        nums[5] = 789;
        nums[6] = 285;
        nums[7] = 344;
        nums[8] = -111;
        nums[9] = 0;
         min = max = nums[0];


         for(int i = 0; i < 10; i ++) {
             if (nums [i] < min) min = nums[i];
             if (nums [i] > max) max = nums[i];

         }
          System.out.println("min " + min + " max " + max);












    }
}
