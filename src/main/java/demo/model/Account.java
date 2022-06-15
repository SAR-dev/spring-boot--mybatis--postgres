package demo.model;

public class Account {

    private Long id;
    private String name;
    private Integer salary;
    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Account(Long id, String name, Integer salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }
}
