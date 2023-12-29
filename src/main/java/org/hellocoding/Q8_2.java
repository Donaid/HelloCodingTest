package org.hellocoding;



/*
    1. 총학생 수 입력받음
    2. 각 학생별로 국어, 영어, 수학 점수 입력
    3. 총점과 평균
 */


import java.util.Scanner;

public class Q8_2 {

    int studentAll = 0;
    int language = 0;
    int english = 0;
    int math = 0;
    int languageSum = 0;
    int englishSum = 0;
    int mathSum = 0;

    int SUM = 0;
    Scanner input = new Scanner(System.in);

    public int studentStatic(int[] score){
        SUM = 0;
        for(int j = 0; j < score.length; j++){
            SUM += score[j];
        }
        return SUM;
    }

    public void Q8_2(){

        System.out.println("총 학생수를 입력해주세요");
        studentAll = input.nextInt();
        int[][] scores = new int[3][studentAll];

        for(int i = 0; i< studentAll; i++){
            System.out.printf("%d 번째 학생의 국어점수. %d/%d %n", i+1, i+1, studentAll);
            scores[0][i] = input.nextInt();
            System.out.printf("%d 번째 학생의 영어점수. %d/%d %n", i+1, i+1, studentAll);
            scores[1][i] = input.nextInt();
            System.out.printf("%d 번째 학생의 수학점수. %d/%d %n", i+1, i+1, studentAll);
            scores[2][i] = input.nextInt();
        }

        languageSum = studentStatic(scores[0]);
        englishSum = studentStatic(scores[1]);
        mathSum = studentStatic(scores[2]);

        System.out.printf("국어합계 : %d, 국어평균 : %.2f %n", languageSum, (double) languageSum/studentAll);
        System.out.printf("영어합계 : %d, 영어평균 : %.2f %n", englishSum, (double) englishSum/studentAll);
        System.out.printf("수학합계 : %d, 수학평균 : %.2f %n", mathSum, (double) mathSum/studentAll);

    }
}
