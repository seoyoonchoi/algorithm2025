package javaint;

import java.util.*;

//가장 흔한 단어
/*
* 금지된 단어를 제외하고 가장 흔하게 등장하는 단어를 출력하라. 대소문자를 구분하지 않으며 구두점 또한 무시한다
* ㄴ
* */
public class Class04 {
    public static void main(String[] args) {

    }

    public String mostCommonWord(String p, String[] banned){
        //금지어 목록이 String 배열이므로, 비교 메서드를 사용하는 Set으로 변경한다
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        //각 단어별 개수가 저장될 키-값 맵
        Map<String, Integer> counts = new HashMap<>();

        //전처리 작업 후 단어 목록을 배열로 저장
        String[] words = p.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for(String w: words){
            //금지된 단어를 아닌 경우 개수 처리
            if(!ban.contains(w)){
                //지금까지 저장된 적 없는 단어라면 기본값을 0으로 지정 후 추출한 값에 +1하여 저장
                counts.put(w, counts.getOrDefault(w,0)+1);

            }
        }
        //가장 흔하게 등장하는 단어 추출
        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
