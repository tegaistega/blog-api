package com.restapi.myblog.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.restapi.myblog.model.Album;
import com.restapi.myblog.model.Comment;
import com.restapi.myblog.model.Post;
import com.restapi.myblog.model.Todo;
import com.restapi.myblog.model.audit.DateAudit;
import com.restapi.myblog.model.role.Role;
import org.hibernate.annotations.NaturalId;

import javax.mail.Address;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

public class User extends DateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long userid;

    @NotBlank
    @Column(name = "first_name")
    @Size(max = 40)
    private String userFirstname;

    @NotBlank
    @Column(name = "first_name")
    @Size(max = 40)
    private String userLastname;

    @NotBlank
    @Column(name = "username")
    @Size(max = 15)
    private String username;

    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(max = 100)
    @Column(name = "password")
    private String userPassword;

    @NotBlank
    @NaturalId
    @Size(max = 40)
    @Column(name = "email")
    @Email
    private String userEmail;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "phone")
    private String userPhonenumber;

    @Column(name = "website")
    private String website;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Todo> todos;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Album> albums;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "company_id")
    private Company company;




}
