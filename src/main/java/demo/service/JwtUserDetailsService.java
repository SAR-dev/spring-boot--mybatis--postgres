package demo.service;

import java.util.ArrayList;
import java.util.List;

import demo.controller.UserDTO;
import demo.mapper.UsersMapper;
import demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    private final UsersMapper usersMapper;

    public JwtUserDetailsService(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("javainuse".equals(username)) {
            return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    public UserDTO save(UserDTO user) {
        user.setPassword(bcryptEncoder.encode(user.getPassword()));
        usersMapper.addUsers(user);
        return user;
    }

    public List<Users> all(){
        return usersMapper.getAllUsers();
    }
}