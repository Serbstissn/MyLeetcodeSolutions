package com.sebcio.leet_questions.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int waysToGetOneStepBeforeGoal = climbStairs(n - 1);
        int waysToGetTwoStepBeforeGoal = climbStairs(n - 2);

        return waysToGetOneStepBeforeGoal + waysToGetTwoStepBeforeGoal;
    }
}
