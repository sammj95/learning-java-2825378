public class Student {
    // instance variables
    String firstName;
    String lastName;
    int expectedGraduationYear;
    double GPA;
    String major;
    String minor;

    // constructor
    public Student (String firstName, String lastName, int expectedGraduationYear,
                    double GPA, String major, String minor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.major = major;
        this.minor = minor;
    }

    // instance method
    public void delayGraduation() {
        this.expectedGraduationYear++;
    }
}
