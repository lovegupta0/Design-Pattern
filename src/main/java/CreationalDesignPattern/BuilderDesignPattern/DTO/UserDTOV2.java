package CreationalDesignPattern.BuilderDesignPattern.DTO;

public class UserDTOV2 implements UserDTO {
    private String uid;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String role;

    public UserDTOV2(String uid, String email, String firstName, String lastName, String password, String role) {
        this.uid = uid;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
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
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserDTOV2{" +
                "uid='" + uid + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
