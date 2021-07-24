package demo.student;

public class CountGrade {
    String name;
    int math;
    int english;

    public CountGrade(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){


        System.out.println(name + "\t" + math + "\t" + english + "\t" + (math + english)/2);



    }
}






