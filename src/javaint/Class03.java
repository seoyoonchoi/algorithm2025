package javaint;

import java.util.ArrayList;
import java.util.List;

public class Class03 {
    //로그의 가장 앞부분은 식별자로서, 순서에 영향을 끼치지 않는다
    //문자로 구성된 로그가 숫자 로그보다 앞에 오며, 문자로그는 사전순으로 한다
    //문자가 동일한 경우식별자순으로 한다
    public static void main(String[] args) {

    }

    public String[] reorderLogFiles(String[] logs){
        //문자 로그를 저장할 문자 리스트
        List<String> letterList = new ArrayList<>();
        //숫자 로그를 저장할 숫자 리스트
        List<String> digitList = new ArrayList<>();

        for(String log : logs){
            //로그 종류 확인 후 숫자 로그라면 숫자 리스트에 삽입
            if(Character.isDigit(log.split(" ")[1].charAt(0))){
                digitList.add(log);
            }else{
                //숫자 로그가 아니라면 문자 리스트에 삽입
                letterList.add(log);
            }
        }

        letterList.sort((s1,s2)-> {
            String[] s1x = s1.split(" ",2);
            String[] s2x = s2.split(" ",2);

            //문자 로그 사전순 비교
            int compared = s1x[1].compareTo(s2x[1]);

            if(compared == 0){
                return s1x[0].compareTo(s2x[0]);
            }else{
                return compared;
            }
        });

        letterList.addAll(digitList);
        return letterList.toArray(new String[0]);

    }
}
