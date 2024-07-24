class Solution {
    public boolean isPalindrome(String s) {
         s = s.strip();
         if (s.isEmpty())
             return true;
        s = s.toLowerCase();
        StringBuffer right = new StringBuffer();
        StringBuffer reverse = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                right.append(s.charAt(i));
                reverse.insert(0,s.charAt(i));
            }
        }
        if (right.isEmpty()) {
            return true;
        }
        return right.toString().contentEquals(reverse);
    }
}
