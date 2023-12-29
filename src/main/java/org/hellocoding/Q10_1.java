package org.hellocoding;



/*
    숫자 맞추기 게임을 만드세요
    1. 1~100 숫자 무작위 추출
    2. 공격수가 숫자입력
    3. 'input > 수비수' 일시 더 작은숫자 출력
    4. 'input < 수비수' 일시 더 큰숫자 출력
    5. 같으면 정답입니다 출력
    6. 맞출때까지 반복
*/

import java.util.Random;
import java.util.Scanner;

public class Q10_1{

    private int random(int min, int max){
        Random randomNumber = new Random();
        int result = randomNumber.nextInt(max-min+1) + min;
        return result;
    }

    public void Q10_1(){
        int offence = 0;
        int defence = 0;
        boolean answer = false;

        Scanner input = new Scanner(System.in);

        int defenceNumber = random(1,100);

        while(!answer){

            System.out.println("공격수 숫자를 입력해주세요");
            int offenceNumber = input.nextInt();

            if (defenceNumber < offenceNumber){
                System.out.println("공격수보다 수비수의 숫자가 [더 작은 숫자입니다.]");
            }
            if (defenceNumber > offenceNumber){
                System.out.println("공격수보다 수비수의 숫자가 [더 큰 숫자입니다.]");
            }
            if (defenceNumber == offenceNumber){
                System.out.println("[정답입니다.]");
                answer = true;
            }
        }
    }


}
