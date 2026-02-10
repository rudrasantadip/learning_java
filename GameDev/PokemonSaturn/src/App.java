import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dtos.UserDTO;
import models.User;
import utils.DtoConverter;

/*
Mutation -> changing the state of an existing object
*/

public class App {

    static void sendDatatoUser(UserDTO userDTO){
        System.out.println(userDTO);
    }


    public static List<User> getUsers(){
        return List.of(
            new User(1L, "asdf@123","password",21,true,null),
            new User(1L, "asdf@456","password",21,true,null),
            new User(1L, "asdf@789","password",21,true,null));
         }

    public static void main(String[] args) throws Exception {
        /*
        Object
        Set identifies the uniquenes of two objects by callings their
        equals method and comparing their hashcode
        */
        List<User> users = getUsers();
        User u = new User(1L, "asdf@123","password",21,true,null);
        UserDTO userDTO = DtoConverter.toUserDto.apply(u);
        System.out.println(userDTO);
        /*
            DTO -> Data Transfer Object
        */

    }
}
