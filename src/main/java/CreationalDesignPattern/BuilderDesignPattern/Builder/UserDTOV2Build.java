package CreationalDesignPattern.BuilderDesignPattern.Builder;

import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTO;

public interface UserDTOV2Build {

    public UserDTOV2Build setFirstName(String fname);
    public UserDTOV2Build setLastName(String lname);
    public UserDTOV2Build setUID(String uid);
    public UserDTOV2Build setRole(String role);
    public UserDTOV2Build setEmail(String email);
    public UserDTOV2Build setPassword(String password);

    public UserDTO build();
    public UserDTO getUserDTO();
}
