package Tasks;
class Course{
    public String courseName;
    private String instructor;
    private int credits;
    public Course( String courseName,String instructor,int credits){
        this.courseName=courseName;
        this.instructor=instructor;
        this.credits=credits;
    }
    public String getcourseName(){
        return courseName;
    }
    public String getinstructor(){
        return instructor;
    }
    public int getcredits(){
        return credits;
    }
    public void displayCourse(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}
class OnlineCourse extends Course{
    public String platform;
    public int duration;
    public OnlineCourse(String courseName, String instructor, int credits,String platform,int duration) {
        super(courseName, instructor, credits);
        this.platform=platform;
        this.duration = duration;
    }
    public String getPlatform() {
        return platform;
    }

    public int getDuration() {
        return duration;
    }
    public void displayCourse(){
        super.displayCourse();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }
    public boolean isEligibleForCertificate(){
        return duration >= 10;
    }
}
public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Java", "John Doe", 3);
        course.displayCourse();

        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java Programming", "Jane Smith", 4, "Udemy", 7);
        onlineCourse.displayCourse();

        if (onlineCourse.isEligibleForCertificate()) {
            System.out.println("This online course is eligible for a certificate.");
        } else {
            System.out.println("This online course is not eligible for a certificate.");
        }

    }
}
