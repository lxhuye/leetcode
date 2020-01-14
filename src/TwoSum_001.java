import java.util.HashMap;
//题目要求：找到相加只和为目标数的数据对（有且仅有一对）

//思路总结：主要是利用HashMap的特点 取出数据是O(1)时间
//通过判断 target - 要加入map的值 是否存在来找到符合条件的一对
//需要注意的是，key不允许重复， 但是如果使用相同的key并不会报错，而是覆盖原有的值
//因为题目要求数据对有且仅有一对，加入有相同值和另外一个值相加为目标数，那么就不符合题意

public class TwoSum_001 {
    public static void main(String[] args) {
        int target = 9;
        int[] ans = new int[2];
        int[] nums = new int[]{2, 7, 11, 15};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(target - nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                ans[1] = i;
                ans[0] = hashMap.get(target - nums[i]);
            }
        }
        System.out.println(ans[1]);
        System.out.println(ans[0]);
    }
}

