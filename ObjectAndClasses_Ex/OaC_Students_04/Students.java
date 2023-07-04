package OaC_Students_04;

public class Students {
    private String firstName;
    private String lastName;
    private double grade;

    public Students(String fn,String ln,double grade){
        this.firstName=fn;
        this.lastName=ln;
        this.grade=grade;
    }
    public double getGrade(){
        return this.grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}