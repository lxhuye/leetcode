//使用反向思路，假定数组第一个字符串是最长共字符串
//使用数组的 indexOf方法判断这个最长共字符串是不是在下一个字符串中 如果不在，获取原最长共字符串的子串，继续判断； 如果在， 就跳到数组中的下一个字符串，判读是否有共字符串

public class LongestCommonPrefix_014 {
    public static void main(String[] args) {
        String[] strings = new String[]{"flower", "flow", "floght"};
        int i = 0;
        if (strings.length == 0 || strings[0] == null) {
            System.out.println("");
        }
        String pre = strings[0];
        while (i < strings.length) {
            while (strings[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        System.out.println(pre);
    }


}
