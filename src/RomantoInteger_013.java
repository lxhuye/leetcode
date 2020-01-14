import java.util.HashMap;
//思路简答：首先需要明白罗马数字的计算方式： 假如左边的数大于右边的数，则两数相加； 反之，右边的数减去左边的数
//在这里需要有指针的概念，我们假定有一个指针i指向左边的数（注意：指针指向右边的数容易造成空指针异常），那么右边的数就应该是i+1
//通过比较i所在的数和i+1所在的数， 我们可以确定罗马数字的加减情况
public class RomantoInteger_013 {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println();
        int ans = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        if (s == null || s.length() == 0) {
            System.out.println("不存在");
        } else {
            ans = ans + hashMap.get(s.charAt(s.length()-1));
        }

        for (int i = s.length() - 2; i >= 0; i--) {

                if (hashMap.get(s.charAt(i + 1)) <= hashMap.get(s.charAt(i))) {
                    ans += hashMap.get(s.charAt(i));
                } else {
                    ans -= hashMap.get(s.charAt(i));
                }
        }
        System.out.println(ans);
    }
}


