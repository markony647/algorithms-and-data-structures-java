package psets_for_recap.leetcode_problems.math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbersVTwo {
    /*
    A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.
     */

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isSelfDividing(int i) {
        int myNum = i;
        boolean selfDividing = true;
        if (i > 0 && i <= 9) {
            return true;
        } else {
            while (i > 0 && selfDividing) {
                if (i % 10 == 0) {
                    selfDividing = false;
                } else {
                    if (myNum % (i % 10) != 0) {
                        selfDividing = false;
                    }
                }
                i /= 10;
            }
        }
        return selfDividing;
    }

    public static void main(String[] args) {
        new SelfDividingNumbersVTwo().selfDividingNumbers(1, 22);
    }
}
