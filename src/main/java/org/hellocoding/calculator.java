package org.hellocoding;

import java.util.Scanner;

public class calculator {
    int numFirst = 0;
    int numSecond = 0;
    Scanner input = new Scanner(System.in);


    public void calculator(){
        System.out.println("계산기입니다.");
        System.out.printf("첫번째 숫자 A를 입력해주세요.%n");
        numFirst = input.nextInt();

        System.out.printf("두번째 숫자 B를 입력해주세요.%n");
        numSecond = input.nextInt();

        System.out.printf("%d+%d = %d %n", numFirst, numSecond, numFirst+numSecond);
        System.out.printf("%d-%d = %d %n", numFirst, numSecond, numFirst-numSecond);
        System.out.printf("%dx%d = %d %n", numFirst, numSecond, numFirst*numSecond);
        System.out.printf("%d/%d = %.2f %n", numFirst, numSecond, (double) numFirst/numSecond);
        System.out.printf("%d%%%d = %d %n", numFirst, numSecond, numFirst%numSecond);

    }

}
