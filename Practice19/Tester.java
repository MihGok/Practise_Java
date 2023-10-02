package Practise_Java.Practice19;

import Practise_Java.Practice10.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tester extends Exception {
    public void output(List<Student> arr) {
        for (Student cur : arr) {
            System.out.println(cur.getName() + " " + cur.getScore());
        }
    }

    public Tester() {

    }


    public List<Student> create(List<Student> aarr, List<Student> aarr1) {
        for (Student cur : aarr) {
            aarr1.add(cur);
        }
        return aarr1;
    }

    public List<Student> update(List<Student> arr, Student currrr) {
        arr.add(currrr);
        return arr;
    }

    public Integer lookFor(List<Student> students, Student student) throws Tester {
        if (students.indexOf(student) == -1) {
            throw new Tester();
        }
        return students.indexOf(student);
    }

    public static void main(String[] args) throws Tester {
        Tester test = new Tester();
        List<Student> arr = new ArrayList<Student>();
        List<Student> arr1 = new ArrayList<Student>();
        test.update(arr, new Student(1, "Oleg", "15", "45", 1, 64));
        test.update(arr, new Student(1, "Igor", "15", "45", 1, 18));
        test.update(arr, new Student(1, "Misha", "15", "45", 1, 74));
        test.update(arr1, new Student(1, "Nikita", "15", "45", 2, 37));
        test.update(arr1, new Student(1, "Kirill", "15", "45", 2, 94));
        test.update(arr1, new Student(1, "Vitalya", "15", "45", 2, 5));
        Collections.sort(arr1);
        System.out.println("Sorted list of the second group is: ");
        test.output(arr1);
        List<Student> fin = test.create(arr, arr1);
        System.out.println("Sorted list of all students is: ");
        Collections.sort(fin);
        test.output(fin);
        Student alex = new Student(1, "Oleg", "15", "45", 1, 64);
        try {
            System.out.println(test.lookFor(arr1, alex));
        } catch (Tester e) {
            System.out.println("He doesnot exist");
        }
    }
}

