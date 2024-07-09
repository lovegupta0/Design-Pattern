package CreationalDesignPattern.BuilderDesignPattern.Builder;

import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTO;
import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTOV2;

public class UserDTOV2Builder implements UserDTOV2Build{
    private String uid;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String role;
    private UserDTO dto;
    @Override
    public UserDTOV2Build setFirstName(String fname) {
        firstName=fname;
        return this;
    }

    @Override
    public UserDTOV2Build setLastName(String lname) {
        lastName=lname;
        return this;
    }

    @Override
    public UserDTOV2Build setUID(String uid) {
        this.uid=uid;
        return this;
    }

    @Override
    public UserDTOV2Build setRole(String role) {
        this.role=role;
        return this;
    }

    @Override
    public UserDTOV2Build setEmail(String email) {
        this.email=email;
        return this;
    }

    @Override
    public UserDTOV2Build setPassword(String password) {
        this.password=password;
        return this;
    }

    @Override
    public UserDTO build() {
        dto=new UserDTOV2(uid,email,firstName,lastName,password,role);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
