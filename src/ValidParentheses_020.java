import java.util.Stack;
// 了解了stack的特性： 先进后出
// 想要字符串合法，需要最里面的符号最先出，这样才能配成对
// 当出现一个左边的括号， 我们就往栈中添加一个右括号， 当字符串中出现右括号时，判断是否和栈中最上方的右括号相同； 如果不同则非法
// 在检查完整个字符串后，如果栈中是空的，那么这个字符串就是合法的； 反之如果栈中有其他符号，则说明配对失败， 字符串非法
//需要注意的conner case：如果字符串只有一个或多个右边括号，stack一直都是空的，所以我们要将这个情况排除
public class ValidParentheses_020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(Character c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{')
            {
                stack.push('}');
            }
            else if(c=='[')
            {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
