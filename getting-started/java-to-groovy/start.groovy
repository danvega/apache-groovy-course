import java.util.Date;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dob;

    public User(){

    }

    public User(String first,String last){
        this.firstName = first;
        this.lastName = last;
    }

    public User(String first,String last,String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void printFullName(){
        System.out.println("FullName: " + firstName + " " + lastName);
    }

    @Override
    public String toString(){
        return "Person[first=" + firstName + ",last=" + lastName + "]";
    }

}
