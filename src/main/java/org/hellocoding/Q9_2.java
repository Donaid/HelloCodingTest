package org.hellocoding;

/*
    3학년에 다섯 개의 반이 있고 한 반의 학생은 10명입니다.
    각 반의 학생들의 성적을 입력받아서 반별로 평균을 구하세요.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Q9_2 {
    int[] scores = new int[10];
    int SUM = 0;
    double AVG = 0;
    double classAvgScore = 0;
    Scanner input = new Scanner(System.in);

    public double classScores(){
        SUM = 0;
        AVG = 0;

        for(int j = 0; j < 10; j++){
            System.out.printf("학생 %s 의 성적을 입력해주세요.%n", j+1);
            scores[j] = input.nextInt();
            SUM = SUM + scores[j];
        }
        AVG = (double) SUM/10;

        return AVG;
    }

    public void Q9_2(){

        for(int i = 0; i < 5; i++){
            System.out.printf("class %d : 10명의 학생점수를 입력해주세요.%n", i+1);
            classAvgScore = classScores();
            System.out.printf("class %d 의 평균 점수는 '%.2f' 입니다.%n%n", i+1, classAvgScore);
        }
    }
}
