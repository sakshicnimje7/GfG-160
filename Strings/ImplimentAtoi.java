package Strings;

class ImplimentAtoi {
    static int myAtoi(String s) {
        int sign = 1, res = 0, idx = 0;
        
        // Skip whitespace
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        
        // Handle sign
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            sign = (s.charAt(idx) == '-') ? -1 : 1;
            idx++;
        }
        
        // Process digits
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx) - '0';
            
            // Check for overflow
            if (res > Integer.MAX_VALUE/10 || 
                (res == Integer.MAX_VALUE/10 && 
                 ((sign == 1 && digit > 7) || (sign == -1 && digit > 8)))) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            res = 10 * res + digit;
            idx++;
        }
        
        return res * sign;
    }
    
    public static void main(String[] args) {
        String s = " -0012g4";
        System.out.println(myAtoi(s));
    }
}