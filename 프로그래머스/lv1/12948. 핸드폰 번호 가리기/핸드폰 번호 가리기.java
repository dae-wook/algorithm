class Solution {
    public String solution(String phone_number) {
        char[] c = new char[phone_number.length()];
        for(int i = 0; i < c.length; i++) {
            c[i] = (i < c.length - 4) ? '*' : phone_number.charAt(i);
        }
        return new String(c);
    }
}