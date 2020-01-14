//思路简答：将目标数字用10取模，可以获得其个位数字，再将其个位数字放进我们要求的结果中
public class ReverseInteger_007 {
    public static void main(String[] args) {
        int x = 1534236469;
        //need target=321
        int ans;
        int i = 0;
        while (x != 0) {
            int tail = x % 10;
            ans = i * 10 + tail;
            if ((ans - tail) / 10 != i) {
                System.out.println(0);
            }
            x = x / 10;
            i = ans;
            System.out.println(ans);
        }

    }
}
