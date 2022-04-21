package algorithm.demo;

import java.util.Scanner;

/**
 * 巴什博弈：有一堆n个物品，两个人轮流从这堆物品中取物，规定每次至少取一个，最多取m个。最后取光者得胜。
 * 规律：如果n=m+1，那么由于一次最多只能取m个，所以，无论先取者拿走多少个，后取者都能够一次拿走剩余的物品，后者取胜。因此我们发现了如何取胜的法则：如果n=(m+1)r+s，(r为任意自然数，s≤m),那么先取者要拿走s个物品，如果后取者拿走k(≤m)个，那么先取者再拿走m+1-k个，结果剩下(m+1)(r-1)个，以后保持这样的取法，那么先取者肯定获胜。总之，要保持给对手留下(m+1)的倍数，就能最后获胜。
 * 例题：
 * 你和你的朋友，两个人一起玩游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
 * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏
 * 分析可得：面对4的整数倍的人永远无法翻身，你拿N根对手就会拿4-N根，保证每回合共减4根，你永远对面4倍数，直到4. 相反，如果最开始不是4倍数，你可以拿掉刚好剩下4倍数根，让他永远对面4倍数，这样就可以必胜。
 * 只需要判断n是否是4的整数倍，便可以判断出先走的人是否必胜。如果是，先手必输，否则必胜。
 */
public class BashGame  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入取的石头");
        int n = scanner.nextInt();
        System.out.println("结果");
        System.out.println(canWinNim(n));
    }

    public static boolean canWinNim(int n) {
        if (n%4!=0) {
            return true;
        }else return false;

    }
}
