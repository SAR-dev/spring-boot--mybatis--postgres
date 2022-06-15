package demo.mapper;

import demo.model.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("select * from account")
    List<Account> getAllAccounts();

    @Insert("insert into account(name, salary, email) values(#{name}, #{salary}, #{email})")
    void addAccount(Account account);

}
