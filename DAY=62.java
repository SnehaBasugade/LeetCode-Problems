import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(0, new ArrayList<>(), s, result);
        return result;
    }
    
    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
    
    private void dfs(int i, List<String> curr, String s, List<List<String>> result) {
        if (i == s.length()) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            String sub = s.substring(i, j + 1);
            if (isPalindrome(sub)) {
                curr.add(sub);
                dfs(j + 1, curr, s, result);
                curr.remove(curr.size() - 1);  
            }
        }
    }
}
