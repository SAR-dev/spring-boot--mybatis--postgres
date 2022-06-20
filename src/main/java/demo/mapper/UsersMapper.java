package demo.mapper;

import demo.controller.UserDTO;
import demo.model.Account;
import demo.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersMapper {
    @Select("select * from users")
    List<Users> getAllUsers();

    @Insert("insert into users(username, password) values(#{username}, #{password})")
    void addUsers(UserDTO userDTO);
}
