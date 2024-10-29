import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        // 지갑의 크기, 가로길이의 최댓값, 세로길이의 최댓값을 담을 변수를 선언한다
        int widthMax = 0;
        int heightMax = 0;
        
        //2차원 배열인 sizes를 순회하며 모든 배열을 정렬한뒤 각 배열의 0번째 인덱스를 비교하여 최댓값을 구하고 1번째 인덱스를 비교하여 최댓값을 구한다
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        
            if (sizes[i][0] > widthMax) {
                widthMax = sizes[i][0];
            }
            if (sizes[i][1] > heightMax) {
                heightMax = sizes[i][1];
            }
        }
        
        return widthMax * heightMax;
    }
}