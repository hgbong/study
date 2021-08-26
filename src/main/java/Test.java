import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        int xxx = 13/4;
        xxx=3/2;

        Hashtable<String, Integer> x = new Hashtable<>();
        x.put("k1",11);
        x.put("k2",22);

        Integer i1 = x.get("k1");
        Integer i2 = x.get("k3");

//        x.getOrDefault()

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new Student("김철수", 20));
        priorityQueue.offer(new Student("김영희", 100));
        priorityQueue.offer(new Student("한택희", 66));
        priorityQueue.offer(new Student("이나영", 7));
        priorityQueue.offer(new Student("이혁", 43));
        priorityQueue.offer(new Student("안영희", 100));

    }




    static class Student implements Comparable<Student> {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student target) {
            return this.age <= target.age ? 1 : - 1;
        }

        @Override
        public String toString() {
            return "이름 : " + name + ", 나이 : " + age;
        }
    }
}

class A {

    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        Objects.equals("","");



        return false;
    }
}
