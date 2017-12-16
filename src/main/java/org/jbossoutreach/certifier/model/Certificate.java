package org.jbossoutreach.certifier.model;

public class Certificate {

    private String org;
    private String title;
    private String course;
    private Student student;

    public Certificate() {
    }

    public Certificate(String org, String title, String course, Student student) {
        this.org = org;
        this.title = title;
        this.course = course;
        this.student = student;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
