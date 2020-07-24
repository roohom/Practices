package com.roohom.demo.homework.day09.ScoreManageSystem;

/**
 * ClassName: TestStudentTool
 * Author: Roohom
 * Function:测试类
 * Date: 2020/7/24 19:29
 * Software: IntelliJ IDEA
 */
public class TestStudentTool {
    public static void main(String[] args) {
        Student[] stus = new Student[5];

        //Student stu = new Student();
        stus[0] = new Student("王大锤",23,98);
        stus[1] = new Student("李大脚",18,99);
        stus[2] = new Student("苏打黑",24,59);
        stus[3] = new Student("光头强",29,58);
        stus[4] = new Student("赵小宝",44,77);

        StudentsTool st = new StudentsTool();
        System.out.println("遍历打印学生信息:");
        st.listStudents(stus);
        System.out.println("获取学生成绩的最高分:");
        System.out.println((st.getMaxScore(stus)));
        System.out.println("获取学生成绩最高的学员:");
        System.out.println(st.getMaxStudent(stus).toString());
        System.out.println("获取学生成绩的平均值:");
        System.out.println(st.getAverageScore(stus));
        System.out.println("获取不及格的学员数量:");
        System.out.println(st.getCount(stus));
    }
}
