import java.util.Date;

class Teacher {
    String firstName;
    String lastName;
    Date birthDate;
    Date hireDate;

    public Teacher(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString() {
        return "Teacher Name: " + firstName + " " + lastName + "\n" +
               "Birthday: " + birthDate.toString() + "\n" +
               "Hire Date: " + hireDate.toString();
    }
}

public class ClassTeacher {
    public static void main(String[] args) {
        Date birthDate = new Date(90, 5, 15);
        Date hireDate = new Date(120, 7, 1); 
        
        Teacher teacher = new Teacher("John", "Doe", birthDate, hireDate);
        
       
        System.out.println(teacher);
    }
}