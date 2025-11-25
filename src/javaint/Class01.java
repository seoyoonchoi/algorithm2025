package javaint;

//팰린드롬 판별
public class Class01 {
    public static void main(String[] args) {
        Class01 c = new Class01();
        System.out.println(c.isPalindrome("collllllflloc"));
        System.out.println(c.isPalin("coloc"));

    }

    //1. 맨 끝글자씩 추출해서 같은지 비교하기
    public boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(!Character.isLetterOrDigit(str.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(str.charAt(end))){
                end--;
            }else{
                if(Character.toLowerCase(str.charAt(start))!= Character.toLowerCase(str.charAt(end))){
                    return false;
                }else{
                    start ++;
                    end --;
                }
            }
        }
        return true;
    }

    //2. 뒤집은 다음 같은지 비교하기
    public boolean isPalin(String s){
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
}
