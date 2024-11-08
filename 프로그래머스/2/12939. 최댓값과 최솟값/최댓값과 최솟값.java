class Solution {
    public String solution(String s) {
        
        String[] result = s.split(" ");

        int max = Integer.parseInt(result[0]);
        int min = Integer.parseInt(result[0]);

        for(int i = 0; i < result.length; i++){
            if(max < Integer.parseInt(result[i])){
                max = Integer.parseInt(result[i]);
            }
            if(min> Integer.parseInt(result[i])){
                min = Integer.parseInt(result[i]);
            }
        }
        
        String answer = "";
        
        answer = min + " " + max;
        
        return answer;
    }
}