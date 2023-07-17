import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arranging(n));
    }
    public static int Arranging(int n)
    {
        int left = 1,right=n,max=0;
        while(left<=right) {
            int mid = (left + right) / 2;
            int coins = (mid )* (mid+1) / 2;
            if (coins > n)
                right = mid - 1;
            else
            {
                left = mid + 1;
                max = Math.max(mid, max);
            }
        }
        return max;
    }
}
//finding natural numbers..
//finding mid and checking with natural num(coins)
//You have n coins and you want to build a staircase with these coins.
// The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
//Given the integer n, return the number of complete rows of the staircase you will build.
//Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2