package javaint;

//문자열 뒤집기
public class Class02 {
    public static void main(String[] args) {
        Class02 a = new Class02();
        System.out.println(a.reverseString(new char[]{'a', 'b', 'c', 'd', 'e'}));


    }

    public char[] reverseString(char[] s){
        int start = 0;
        int end = s.length-1;

        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return s;


    }
}
