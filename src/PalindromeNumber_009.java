//思路简答：思路类似于007题
//小于0的一定非回文数
public class PalindromeNumber_009 {
    public static void main(String[] args) {
        int x = 121;
        int y = x;
        int ans = 0;
        int tail = 0;
        if (x < 0) {
            System.out.println(0);
        }
        while (y != 0) {
            tail = y % 10;
            ans = ans * 10 + tail;
            y = y / 10;
        }
        System.out.println(ans - x);
        if (ans==x) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
