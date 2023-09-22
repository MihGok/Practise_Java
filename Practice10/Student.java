package Practise_Java.Practice10;
public class Student implements Comparable<Student> {
    private int course;
    private String name;
    private String surname;
    private String profile;
    private int group;
    private float score;
    public float getScore() {
        return score;
    }
    public Student(int course, String name, String surname, String profile, int group,int score) {
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.profile = profile;
        this.group = group;
        this.score = score;
    }

    public void setKurs(int course) {
        this.course = course;
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

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCours() {
        return course;
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

    public int getGroup() {
        return group;
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