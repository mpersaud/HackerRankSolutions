import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static int ascii_deletion_distance(String str1, String str2) {
        int val =0;
        Map<Character,Integer> map = new HashMap<>();
        for(char c: str1.toCharArray()){
            val+=(int)c;
        }

        for(char c: map.keySet()){
            val-=(int)c;

        }
        System.out.println(val);
        return val;
    }
    public static int almost_palindromes(String str) {
        int count =0;
        StringBuilder sb = new StringBuilder();
        String rev= sb.append(str).reverse().toString();
        //System.out.println(str);
        //System.out.println(rev);
        for(int i =0; i<rev.length();i++){
            if(rev.charAt(i)!=str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int bracket_match(String bracket_string) {
        Stack<Character> stack = new Stack<Character>();
        for(char c: bracket_string.toCharArray()){
            if(c=='('){
                stack.push('(');
            }
            else if(c==')' && stack.empty()){
                stack.pop();
            }
        }
        return (stack.empty()) ? 0:stack.size();

    }
}
