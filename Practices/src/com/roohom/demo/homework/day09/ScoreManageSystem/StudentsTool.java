package com.roohom.demo.homework.day09.ScoreManageSystem;

import java.util.Arrays;

/**
 * ClassName: StudentsTool
 * Author: Roohom
 * Function:学生工具类
 * Date: 2020/7/24 19:20
 * Software: IntelliJ IDEA
 */
public class StudentsTool {
    /**
     * Function:遍历打印学生信息
     *
     * @param arr 学生类类型的数组
     */
    public void listStudents(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //第i个对象
            System.out.println("姓名:" + arr[i].getName() + ",年龄:" + arr[i].getAge() + ",成绩:" + arr[i].getScore());
        }
    }

    /**
     * Function:获取学生成绩的最高分
     *
     * @param arr 学生类类型的数组
     * @return 学生的最高成绩
     */
    public int getMaxScore(Student[] arr) {
        int[] scoreArr = new int[5];
        for (int i = 0; i < scoreArr.length; i++) {
            scoreArr[i] = arr[i].getScore();
        }
        Arrays.sort(scoreArr);
        return scoreArr[arr.length - 1];
    }

    /**
     * Function:获取成绩最高的学员
     *
     * @param arr 学生类类型的数组
     * @return 成绩最高的学员的对象
     */
    public Student getMaxStudent(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getScore() == getMaxScore(arr))
                return arr[i];
        }
        return arr[0];
    }

    /**
     * Function:获取学生成绩的平均值
     *
     * @param arr 学生类类型的数组
     * @return double类型的平均成绩
     */
    public double getAverageScore(Student[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getScore();
        }
        return sum / arr.length;
    }

    /**
     * Function:获取不及格的学员数量
     *
     * @param arr 学生类类型的数组
     * @return 整数类型的学员数量
     */
    public int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getScore() < 60)
                count++;
        }
        return count;
    }

}
