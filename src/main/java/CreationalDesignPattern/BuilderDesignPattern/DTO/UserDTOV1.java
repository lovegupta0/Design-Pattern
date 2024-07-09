package CreationalDesignPattern.BuilderDesignPattern.DTO;

public class UserDTOV1 implements UserDTO{
    private String uid;
    private String email;
    private String firstName;
    private String lastName;
    private String role;

    public UserDTOV1(String uid, String email, String firstName, String lastName, String role) {
        this.uid = uid;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    @Override
    public String getUid() {
        return uid;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserDTOV1{" +
                "uid='" + uid + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
