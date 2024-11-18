#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    int answer = 0;
    
    if (0 < angle && angle < 90) {
        return answer = 1;
    } else if (90 < angle && angle < 180) {
        return answer = 3;
    } else if (angle == 90) {
        return answer = 2;
    } else {
        return answer = 4;
    }
    
    return answer;
}