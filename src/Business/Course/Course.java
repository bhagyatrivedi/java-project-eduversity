/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;

/**
 *
 * @author Bhagya
 */
public class Course {
    private String crn;
    private String courseId;
    private String program;
    ArrayList<String> courseAvailableforPrograms = new ArrayList<>();
    private String courseName;
    private String credits;
    private String offeringTerm;
    private String roomAndBuildingLocation;
    private String classDayAndTime;
    private String offeringDegree;
    private String profName;
    private String profId;
    private Double profRating;
    ArrayList<Double>profRatingsList = new ArrayList<>();
    ArrayList<CourseGrading> courseGradeList = new ArrayList<>();

    public ArrayList<CourseGrading> getCourseGradeList() {
        return courseGradeList;
    }

    public void setCourseGradeList(ArrayList<CourseGrading> courseGradeList) {
        this.courseGradeList = courseGradeList;
    }

    public ArrayList<Double> getProfRatingsList() {
        return profRatingsList;
    }

    public void setProfRatingsList(ArrayList<Double> profRatingsList) {
        this.profRatingsList = profRatingsList;
    }

    public Double getProfRating() {
        return profRating;
    }

    public void setProfRating(Double profRating) {
        this.profRating = profRating;
    }
    
    
    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }
    
   
    public String getOfferingDegree() {
        return offeringDegree;
    }

    public void setOfferingDegree(String offeringDegree) {
        this.offeringDegree = offeringDegree;
    }
    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public ArrayList<String> getCourseAvailableforPrograms() {
        return courseAvailableforPrograms;
    }

    public void setCourseAvailableforPrograms(ArrayList<String> courseAvailableforPrograms) {
        this.courseAvailableforPrograms = courseAvailableforPrograms;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getOfferingTerm() {
        return offeringTerm;
    }

    public void setOfferingTerm(String offeringTerm) {
        this.offeringTerm = offeringTerm;
    }

    public String getRoomAndBuildingLocation() {
        return roomAndBuildingLocation;
    }

    public void setRoomAndBuildingLocation(String roomAndBuildingLocation) {
        this.roomAndBuildingLocation = roomAndBuildingLocation;
    }

    public String getClassDayAndTime() {
        return classDayAndTime;
    }

    public void setClassDayAndTime(String classDayAndTime) {
        this.classDayAndTime = classDayAndTime;
    }

    @Override
    public String toString() {
        return courseName;
    }
    
   
}
