package org.hellocoding;

/*
    for문을 사용하도록 수정한 디지털 도어락 시스템
    1. 비밀번호 입력 제한을 5번 까지만 틀리도록
    2. 비밀번호 길이는 5자리 이상
 */
import java.util.Scanner;

public class Q9_1 {
    int[] passwordSystem = {1,2,3,4,5};
    boolean passwordMatch = true;
    int passwordMatchCount = 1;

    Scanner input = new Scanner(System.in);

    public void Q9_1(){

        while(passwordMatchCount <= 5){
           for (int i = 0; i <= 4; i++) {
               System.out.printf("%s 번째 비밀번호를 입력해주세요.(%s번째 시도)%n", i + 1, passwordMatchCount);
               int passwordUser = input.nextInt();

               if (passwordUser == passwordSystem[i]) {
                   continue;
               } else {
                   System.out.println("비밀번호가 틀립니다.");
                   passwordMatch = false;
                   break;
               }
           }
           if (passwordMatch){
               System.out.println("비밀번호가 맞습니다.");
               break;
           }
            passwordMatchCount++;
       }
        if(passwordMatchCount > 5) {
            System.out.println("입력 횟수를 초과하였습니다.(5회)");
        }


    }
}
