package ua.kiev.javacourses.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Алена on 19.03.14.
 */

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(unique=true)
    private String login;
    private String password;
    private String userName;
    private String mail;

    @OneToMany
    @JoinColumn(name="OrderId")
    private List<ClientOrder> orders;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() { /*NOP*/ }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<ClientOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ClientOrder> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", orders=" + orders +
                '}';
    }
}
