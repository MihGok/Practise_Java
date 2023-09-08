package Practise_Java.Practice10;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student implements Comparable<Student> {
    private int kurs;
    private String name;
    private String surname;
    private String profile;
    private int gruppa;
    private float score;
    public float getScore() {
        return score;
    }

    public Student(int kurs, String name, String surname, String profile, int gruppa,int score) {
        this.kurs = kurs;
        this.name = name;
        this.surname = surname;
        this.profile = profile;
        this.gruppa = gruppa;
        this.score = score;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setGruppa(int gruppa) {
        this.gruppa = gruppa;
    }

    public int getKurs() {
        return kurs;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getProfile() {
        return profile;
    }

    public int getGruppa() {
        return gruppa;
    }

    @Override
    public int compareTo(Student student) {
        if(score == student.getScore()){
            return 0;
        }
        if (score<student.getScore()){
            return 1;
        }
        return -1;
    }
}