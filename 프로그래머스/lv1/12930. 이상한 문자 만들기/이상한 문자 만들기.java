class Solution {
    public String solution(String s) {
                String answer = "";

        String[] strArray = s.split("");

        int sNum = 0;
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(" ")){
                answer += " ";
                sNum = 0;
                continue;
            }
            if(sNum % 2 == 0){
                strArray[i] = strArray[i].toUpperCase();
                sNum++;
            }else if(sNum % 2 != 0){
                strArray[i] = strArray[i].toLowerCase();
                sNum++;
            }
            answer += strArray[i];
        }
        return answer;
    }
}