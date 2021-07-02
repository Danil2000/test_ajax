import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tasks {
    public int addTwoDigits(int n) {
        return n / 10 + n % 10;
    }
    public int largestNumber(int n) {
        int i = 1;
        String bigNum = "9";
        while(i < n){
            bigNum += '9';
            i++;
        }
        return Integer.parseInt(bigNum);
    }
    public char firstNonRepeatingCharacter(String s) {
        for(Character ch:s.toCharArray()){
            if(s.indexOf(ch)==s.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '_';
    }
}
