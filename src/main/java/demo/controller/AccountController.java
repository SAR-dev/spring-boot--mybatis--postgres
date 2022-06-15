package demo.controller;

import demo.mapper.AccountMapper;
import demo.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountMapper accountMapper;

    public AccountController(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @GetMapping("/all")
    public List<Account> getAllAccounts() {
        return accountMapper.getAllAccounts();
    }

    @PostMapping("/")
    public void addAccount(@RequestBody Account account) {
        accountMapper.addAccount(account);
    }
}
