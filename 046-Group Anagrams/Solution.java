import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> stringAnagramsMap = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if (!stringAnagramsMap.containsKey(key))
                stringAnagramsMap.put(key, new ArrayList<>());

            stringAnagramsMap.get(key).add(s);
        }

        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
            resultList.add(stringAnagrams.getValue());
        }
        return resultList;
    }

    public List<List<String>> groupAnagramsCategorizeByFrequency(String[] strs) {
        // Check for empty inputs
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> frequencyStringsMap = new HashMap<>();
        for (String str : strs) {
            String frequencyString = getFrequencyString(str);

            // If the frequency string is present, add the string to the list
            if (frequencyStringsMap.containsKey(frequencyString)) {
                frequencyStringsMap.get(frequencyString).add(str);
            } else {
                // else create a new list
                List<String> strList = new ArrayList<>();
                strList.add(str);
                frequencyStringsMap.put(frequencyString, strList);
            }
        }

        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : frequencyStringsMap.entrySet()) {
            resultList.add(entry.getValue());
        }
        return resultList;
    }

    private String getFrequencyString(String str) {
        int[] freq = new int[26]; // Assuming lowercase English letters
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                sb.append((char) ('a' + i));
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
}
