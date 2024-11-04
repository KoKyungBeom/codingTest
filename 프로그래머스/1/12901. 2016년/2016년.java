class Solution {
    public String solution(int a, int b) {
        // a = 1~12 b = 1~31 a = 1,b = 1 -> "FRI"
        // 요일을 담을 String 배열을 만든뒤 7일씩 돌아가니 b를 7로 나눈 나머지에 따라 요일을 반환한다
        // a 마다 b가 다르니 a에 따라 b의 케이스를 정해준다
        // 1,3,5,7,8,10,12, 2, 4,6,9,11
        // a + b = 2 FRI, a + b = 3 SAT, a + b = 4 SUN, 
        // a + b = 5 MON, a + b = 6 TUE, a + b = 7 WED, a + b = 8 THU
        // a + b = 9 FRI
        String answer = "";
        
        switch(a) {
            case 1:
                a = 1;
                break;
            case 2:
                a = 32;
                break;
            case 3:
                a = 61;
                break;
            case 4:
                a = 92;
                break;
            case 5:
                a = 122;
                break;
            case 6:
                a = 153;
                break;    
            case 7:
                a = 183;
                break;
            case 8:
                a = 214;
                break;
            case 9:
                a = 245;
                break;    
            case 10:
                a = 275;
                break;
            case 11:
                a = 305;
                break;
            case 12:
                a = 336;
                break;                
        } 
        int date = a + b;
        
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        
        switch(date % 7) {
            case 1 : 
                answer = "THU";
                break;
            case 2 : 
                answer = "FRI";
                break;
            case 3 : 
                answer = "SAT";
                break;
            case 4 : 
                answer = "SUN";
                break;
            case 5 : 
                answer = "MON";
                break;
            case 6 : 
                answer = "TUE";
                break;
            default : 
                answer = "WED";
                break;
        }
        
        return answer;
    }
}