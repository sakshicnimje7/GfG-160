package Strings;

class Solution01 {
    static int myAtoi(String s) {
         int sign = 1, res = 0, idx = 0;
         
         while (idx < s.length() && s.charAt(idx) == ' ') {
             idx++;
         }
         
         if(idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
             if(s.charAt(idx++) == '-') {
                 sign = -1;
             }
         }
         
         while(idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
             int digit = s.charAt(idx) - '0';
             
             if(sign == 1 && (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit > 7))) {
                 return Integer.MAX_VALUE;
             }
             if(sign == -1 && (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit > 8))) {
                 return Integer.MIN_VALUE;
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