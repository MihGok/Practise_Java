package Practise_Java.Practice10;

import java.util.*;

class Tester{
    public void output(List<Student> arr){
        for (Student cur:arr){
            System.out.println(cur.getName() + " " + cur.getScore());
        }
    }
    public List<Student> create(List<Student> aarr, List<Student> aarr1){
        for (Student cur:aarr){
            aarr1.add(cur);
        }
        return aarr1;
    }
    public List<Student> update(List<Student> arr, Student currrr){
        arr.add(currrr);
        return arr;
    }
    public static void main(String[] args) {
        Tester test = new Tester();
        List<Student> arr= new ArrayList<Student>();
        List<Student> arr1= new ArrayList<Student>();
        test.update(arr,new Student(1,"Oleg","15","45",1,64));
        test.update(arr,new Student(1,"Igor","15","45",1,18));
        test.update(arr,new Student(1,"Misha","15","45",1,74));
        test.update(arr1,new Student(1,"Nikita","15","45",2,37));
        test.update(arr1,new Student(1,"Kirill","15","45",2,94));
        test.update(arr1,new Student(1,"Vitalya","15","45",2,5));
        Collections.sort(arr1);
        System.out.println("Sorted list of the second group is: ");
        test.output(arr1);
        System.out.println("\n\n");
        List<Student> fin = test.create(arr,arr1);
        System.out.println("Sorted list of all students is: ");
        Collections.sort(fin);
        test.output(fin);
        }
    }

