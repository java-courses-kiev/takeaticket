package ua.kiev.javacourses.entities;

import javax.persistence.*;

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
    private String name;
    private String mail;

    @OneToMany
    @JoinColumn(name="OrderId")
    private ClientOrder clientOrder;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", clientOrder=" + clientOrder +
                '}';
    }
}
