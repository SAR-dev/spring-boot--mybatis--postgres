package demo.mapper;

import demo.jwt.UserDTO;
import demo.model.Profile;
import demo.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersMapper {
    @Select("select * from users")
    List<Users> getAllUsers();

    @Insert("insert into users(username, password) values(#{username}, #{password})")
    void addUsers(UserDTO userDTO);

    @Select("select * from users where username = #{username}")
    Users getUsers(String username);
}
