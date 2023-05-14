package com.springboot.com.restapispringboot;

public class Courses {
    private int id;
    private String content;
    private String tutor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", tutor='" + tutor + '\'' +
                '}';
    }

    public Courses(int id, String content, String tutor) {
        this.id = id;
        this.content = content;
        this.tutor = tutor;
    }
}
