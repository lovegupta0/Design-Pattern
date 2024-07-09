package CreationalDesignPattern.BuilderDesignPattern.Director;

import CreationalDesignPattern.BuilderDesignPattern.DTO.User;
import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTO;
import CreationalDesignPattern.BuilderDesignPattern.Builder.UserDTOV1Build;
import CreationalDesignPattern.BuilderDesignPattern.Builder.UserDTOV2Build;

public class Director {
    public static UserDTO getUserDTOV1(User usr, UserDTOV1Build build){
        return build.setUID(usr.getUid()).setEmail(usr.getEmail())
                .setFirstName(usr.getFirstName()).setLastName(usr.getLastName()).setRole(usr.getRole())
                .build();
    }
    public static UserDTO getUserDTOV2(User usr, UserDTOV2Build build){
        return build.setUID(usr.getUid()).setEmail(usr.getEmail()).setPassword(usr.getPassword())
                .setFirstName(usr.getFirstName()).setLastName(usr.getLastName()).setRole(usr.getRole())
                .build();
    }
}
