package org.hellocoding;
/*
    가위바위보 게임을 만드세요
    1. 1=가위, 2=바위, 3=보
    2. 시스템은 1~3 무작위 선택
    3. 사용자는 1~3 입력
    4. 사용자가 지면 "졌습니다."
    5. 사용자가 이기면 "이겼습니다."
    6. 비기면 "비겼습니다."
    7. 비기면 2로
*/

import java.util.Scanner;
import java.util.Random;

public class Q10_2 {
    int scissors = 1;
    int rock = 2;
    int paper = 3;

    boolean rpsGameResult= false;

    public int random(int min, int max){
        Random random = new Random();
        int result = random.nextInt(max - min+1) + min;
        return result;
    }

    public void Q10_2(){
        Scanner input = new Scanner(System.in);
        while(!rpsGameResult){
            System.out.println("가위바위보 골라주세요. 가위=1, 바위=2, 보=3");
            int userRPS = input.nextInt();
            int systemRPS = random(1,3);
            System.out.printf("사용자 : %s, 시스템 : %s%n",userRPS, systemRPS);

            int resultRPS = userRPS - systemRPS;

            if (userRPS == systemRPS){
                System.out.println("비겼습니다.");
                continue;
            }
            if (resultRPS == 1 || resultRPS == -2){
                System.out.println("이겼습니다.");
            }else{
                System.out.println("졌습니다.");
            }
            rpsGameResult = true;
        }

    }

}
