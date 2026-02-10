package models;

import java.util.Objects;
import java.util.Set;

public class User {
    private Long userId;
    private String username;
    private String password;
    private Integer age;
    private Boolean active;
    private Set<String> roles;

    public User() {

    }
    
    public User(Long userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public User(Long userId, String username, String password, Integer age, Boolean active, Set<String> roles) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.age = age;
        this.active = active;
        this.roles = roles;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        // i need to compare the hashcode
        if (o == this)
            return true;
        if (!(o instanceof User))
            return false;

        User u = (User) o;
        return Objects.equals(u.getUsername(), this.getUsername());
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", age=" + age
                + ", active="
                + active + ", roles=" + roles + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId);
    }

}
