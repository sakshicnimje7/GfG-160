package Strings;

class Solution03 {
    static final int MAX_CHAR = 26;
    static boolean areAnagrams(String s1, String s2) {
        int[] freq = new int[MAX_CHAR];
        
        for(int i = 0; i < s1.length(); i++)
        freq[s1.charAt(i) - 'a']++;
        
        for(int i = 0; i < s2.length(); i++)
        freq[s2.charAt(i) - 'a']--;
        
        for(int count : freq) {
            if(count != 0)
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        
        System.out.println(areAnagrams(s1, s2));
    }
}