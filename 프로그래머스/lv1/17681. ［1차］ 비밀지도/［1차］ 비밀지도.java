class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            answer[i] = "";
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            if(binary1.length() < n) {
                binary1 = "0".repeat(n - binary1.length()) + binary1;
            }
            if(binary2.length() < n) {
                binary2 = "0".repeat(n - binary2.length()) + binary2;
            }
            for(char c : binary1.toCharArray()) {
                if(c == '1') {
                    answer[i] += "#";
                }else {
                    answer[i] += " ";
                }
            }
            for (int j = 0; j < n; j++) {
                if(binary2.charAt(j) == '1') {
                    StringBuilder sb = new StringBuilder(answer[i]);
                    sb.deleteCharAt(j);
                    sb.insert(j,"#");
                    answer[i] = sb.toString();
                }
            }
        }
        return answer;
    }
}