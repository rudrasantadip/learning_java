package utils;

import java.util.function.Function;

import dtos.UserDTO;
import models.User;

//you give T to the function and it returns you R
// you give User to the function and it returns UserDTO


public class DtoConverter {
    public static Function<User,UserDTO> toUserDto = user -> 
    new UserDTO(user.getUserId(),user.getUsername(),user.getPassword());
}
