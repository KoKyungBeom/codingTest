class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length - 1];
        
        int minNum = Integer.MAX_VALUE;
        
        int count = 0;
            
        if(arr.length == 1){
            return answer = new int[]{-1};
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minNum){
                minNum = arr[i];
            }
        }
        
        for(int i=0; i < arr.length; i++){
            if(arr[i] != minNum){
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}