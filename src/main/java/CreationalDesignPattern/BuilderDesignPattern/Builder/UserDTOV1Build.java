package CreationalDesignPattern.BuilderDesignPattern.Builder;

import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTO;

public interface UserDTOV1Build {
    public UserDTOV1Build setFirstName(String fname);
    public UserDTOV1Build setLastName(String lname);
    public UserDTOV1Build setUID(String uid);
    public UserDTOV1Build setRole(String role);
    public UserDTOV1Build setEmail(String email);
    public UserDTO build();
    public UserDTO getUserDTO();
}
