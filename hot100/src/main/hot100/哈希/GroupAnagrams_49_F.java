package main.hot100.哈希;

import java.util.*;

/**
 * 1. char[] key = s.toCharArray();  字符串变字符数组
 * 2. 然后再排序：Arrays.sort(key);
 * 3. String s1 = new String(key); 字符数组变字符串，避免了toString
 */
public class GroupAnagrams_49_F {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String s1 = new String(key);
            List<String> list = map.getOrDefault(s1, new ArrayList<>());
            list.add(s); // 原做：list.add(s1);
            map.put(s1, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
