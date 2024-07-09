package CreationalDesignPattern.SimpleFactory;

import CreationalDesignPattern.BuilderDesignPattern.Builder.UserDTOV1Builder;
import CreationalDesignPattern.BuilderDesignPattern.Builder.UserDTOV2Builder;
import CreationalDesignPattern.BuilderDesignPattern.DTO.User;
import CreationalDesignPattern.BuilderDesignPattern.DTO.UserDTO;
import CreationalDesignPattern.BuilderDesignPattern.Director.Director;

public class SimpleFactory {
    public static UserDTO getUserDTO(String data, User usr){
        switch (data){
            case "DTOV1": return Director.getUserDTOV1(usr,new UserDTOV1Builder());
            case "DTOV2": return Director.getUserDTOV2(usr,new UserDTOV2Builder());
            default:
                System.out.println("Give user dto is not defined");
        }
        return null;
    }
}
