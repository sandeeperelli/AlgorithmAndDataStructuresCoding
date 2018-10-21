package com.ebay.practice.stringAlgo;

import java.util.HashMap;

public class LongestSubStringWithOutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(longestSubString1("seandeep"));

    }

    public static int longestSubString1(String s){

        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public static int longestSubString2(String str){
        if(str.length()<2)
            return str.length();

        int[] visited = new int[256];
        // initilize array
        for(int i=0; i<visited.length;i++){
            visited[i] = -1;
        }

        // first character in string
        visited[0]=0;
        int curr_len=1;
        int max_len =1;
        int prev_index = 0;
        for(int i=1; i<str.length(); i++){

            prev_index = visited[str.charAt(i)];

            if(prev_index == -1 || i-curr_len > prev_index){
                curr_len++;
            }else {
                if(max_len<curr_len)
                    max_len=curr_len;

                curr_len = i-prev_index;
            }
            visited[str.charAt(i)] = i;

        }
        if()






    }
}
