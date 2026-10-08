class Solution {

    //1. Using HashSet
    // public static boolean isHappy(int n) {
    //     HashSet<Integer> seen = new HashSet<>();

    //     while (n != 1) {
    //         if (seen.contains(n)) {
    //             return false;
    //         }
    //         seen.add(n);
    //         n = getSumOfSquares(n);
    //     }

    //     return true;
    // }

    //2. Using Slow Fast Approach
    public static boolean isHappy(int n) {
       int slow = n;
       int fast = n;

       while(fast!=1) {
        slow = getSumOfSquares(slow);
        fast = getSumOfSquares(getSumOfSquares(fast));

        if(fast ==1) {
            return true;
        }
        if(slow == fast) {
            return false;
        }

       } 
       return true;
    }

    public static int getSumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }
}

