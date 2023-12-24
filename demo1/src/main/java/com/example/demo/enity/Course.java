package com.example.demo.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private Long id;
    private String courseName;
    private String teacherName;
    private int state;
    private String courseType;
    private String payType;
    private List<String> comments;//评论

//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getCourseName() {
//        return courseName;
//    }
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//    public String getTeacherName() {
//        return teacherName;
//    }
//
//    public void setTeacherName(String teacherName) {
//        this.teacherName = teacherName;
//    }
//    public int getState() {
//        return state;
//    }
//    public void setState(int state) {
//        this.state = state;
//    }
//    public String getCourseType() {
//        return courseType;
//    }
//    public void setCourseType(String courseType) {
//        this.courseType = courseType;
//    }
//    public String getPayType() {
//        return payType;
//    }
//    public void setPayType(String payType) {
//        this.payType = payType;
//    }

}
