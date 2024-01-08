/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author Bhagya
 */
public class CourseGrading {
    private String studentId;
    private String assignment1;
    private String assignment2;
    private String assignment3;
    private String midTerm;
    private String assignment4;
    private String assignment5;
    private String endTerm;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
   
    public Double getGpa(){
        Double sum=0.0;
        int counter=0;
        if(assignment1!=null){
            Double here = Double.parseDouble(assignment1);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        if(assignment2!=null){
            Double here = Double.parseDouble(assignment2);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        if(assignment3!=null){
            Double here = Double.parseDouble(assignment3);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        if(assignment4!=null){
            Double here = Double.parseDouble(assignment4);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        if(assignment5!=null){
            Double here = Double.parseDouble(assignment5);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        if(midTerm!=null){
            Double here = Double.parseDouble(midTerm);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        if(endTerm!=null){
            Double here = Double.parseDouble(endTerm);
            if(here > 95.00){
                sum+=4.0;
                counter++;
            }else if(here<95.0 && here > 90.00){
                sum+=3.67;
                counter++;
            }
            else if(here>85.00 && here<90.00){
                sum+=3.33;
                counter++;
            }
            else if(here>80.00 && here<85.00){
                sum+=3.00;
                counter++;
            }
            else if(here>70.00 && here<80.00){
                sum+=2.67;
                counter++;
            }
            
        }
        Double gradepa = sum/counter;
        return gradepa;
    }
    public String getFinalGrade(){
        Double sum =0.0;
        int counter=0;
        if(assignment1!=null){
            sum+=Double.parseDouble(assignment1);
            counter++;
        }
        if(assignment2!=null){
            sum+=Double.parseDouble(assignment2);
            counter++;
        }
        if(assignment3!=null){
            sum+=Double.parseDouble(assignment3);
            counter++;
        }
        if(assignment4!=null){
            sum+=Double.parseDouble(assignment4);
            counter++;
        }
        if(assignment5!=null){
            sum+=Double.parseDouble(assignment5);
            counter++;
        }
        if(midTerm!=null){
            sum+=Double.parseDouble(midTerm);
            counter++;
        }
        if(endTerm!=null){
            sum+=Double.parseDouble(endTerm);
            counter++;
        }
      
       Double finalSum = (sum/counter);
       if(finalSum > 95.00)
           return "A";
       if(finalSum > 90.00 && finalSum < 95.00)
           return "A-";
       if(finalSum > 85.00 && finalSum < 90.00)
           return "B+";
       
       if(finalSum > 80.00 && finalSum < 85.00)
           return "B";
       
       if(finalSum > 70.00 && finalSum < 80.00)
           return "B-";
       
       if(finalSum < 70.00)
           return "F";
       if(finalSum == 0.0);
            return "Instructor has not posted the grades yet!";
       
    }
    public String getAssignment1() {
        return assignment1;
    }

    public void setAssignment1(String assignment1) {
        this.assignment1 = assignment1;
    }

    public String getAssignment2() {
        return assignment2;
    }

    public void setAssignment2(String assignment2) {
        this.assignment2 = assignment2;
    }

    public String getAssignment3() {
        return assignment3;
    }

    public void setAssignment3(String assignment3) {
        this.assignment3 = assignment3;
    }

    public String getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(String midTerm) {
        this.midTerm = midTerm;
    }

    public String getAssignment4() {
        return assignment4;
    }

    public void setAssignment4(String assignment4) {
        this.assignment4 = assignment4;
    }

    public String getAssignment5() {
        return assignment5;
    }

    public void setAssignment5(String assignment5) {
        this.assignment5 = assignment5;
    }

    public String getEndTerm() {
        return endTerm;
    }

    public void setEndTerm(String endTerm) {
        this.endTerm = endTerm;
    }

    public String getGrades() {
        return "assignment1= " + assignment1 + ", assignment2= " + assignment2 + ", assignment3= " + assignment3 + ", midTerm= " + midTerm + ", assignment4= " + assignment4 + ", assignment5= " + assignment5 + ", endTerm= " + endTerm;
    }
    
    
}
