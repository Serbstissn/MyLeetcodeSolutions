package com.sebcio.leet_questions.easy;

import java.util.*;

public class IndexPairsOfString {

    /**
     * Given a text string and words (a list of strings), return all index pairs [i, j] so that the substring text[i]...text[j] is in the list of words
     *
     * @param text  to check for words
     * @param words to look for
     * @return list of index pairs of found words
     */
    public static List<Integer[]> pairsOfString(String text, String[] words) {
//        idea: use TreeMap and PriorityQueue to store found indexes because they always store sorted data
//        TreeMap -> stores begin index for findings and a priority queue of ending indexes
//        result returned as List because we don't know the size of answer yet
        Map<Integer, Queue<Integer>> findingsMap = new TreeMap<>();
        List<Integer[]> result = new ArrayList<>();

//        for every word in array of substrings we find and save all index pairs of their occurrence
        for (String w : words) {
            int findIndex = -1;
            Queue<Integer> endIndexes;
            while (true) {
                findIndex = text.indexOf(w, findIndex + 1);
                if(findIndex == -1) break;
                System.out.println(w + " - " + findIndex);
                if (!findingsMap.containsKey(findIndex)) {
                    endIndexes = new PriorityQueue<>();
                } else {
                    endIndexes = findingsMap.get(findIndex);
                }
                endIndexes.offer(findIndex + w.length() - 1);
                findingsMap.put(findIndex, endIndexes);
            }
        }

//        iterate through TreeMap and create answer
        for(Map.Entry<Integer , Queue<Integer>> entry : findingsMap.entrySet()){
            int beginIndex = entry.getKey();
            Queue<Integer> endIndexes = entry.getValue();
            while (!endIndexes.isEmpty()){
                result.add(new Integer[]{beginIndex , endIndexes.poll()});
            }
        }

        return result;
    }


}
