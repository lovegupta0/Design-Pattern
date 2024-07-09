package CreationalDesignPattern.BuilderDesignPattern.Builder;

import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTO;
import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTOV1;

public class UserDTOV1Builder implements UserDTOV1Build{
    private String uid;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private UserDTO dto;
    @Override
    public UserDTOV1Build setFirstName(String fname) {
        firstName=fname;
        return this;
    }

    @Override
    public UserDTOV1Build setLastName(String lname) {
        lastName=lname;
        return this;
    }

    @Override
    public UserDTOV1Build setUID(String uid) {
        this.uid=uid;
        return this;
    }

    @Override
    public UserDTOV1Build setRole(String role) {
        this.role=role;
        return this;
    }

    @Override
    public UserDTOV1Build setEmail(String email) {
        this.email=email;
        return this;
    }

    @Override
    public UserDTO build() {
        dto= new UserDTOV1(uid,email,firstName,lastName,role);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
