package demo.jwt;

import java.util.ArrayList;
import java.util.List;

import demo.jwt.UserDTO;
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
        Users user = usersMapper.getUsers(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
    public UserDTO save(UserDTO user) {
        usersMapper.addUsers(user);
        return user;
    }

    public List<Users> all(){
        return usersMapper.getAllUsers();
    }
}