package com.restapi.myblog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.myblog.model.audit.UserDateAudit;
import com.restapi.myblog.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "comments")
public class Comment extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentid;

    @Column(name = "name")
    @NotBlank
    @Size(min = 4, max = 50)
    private String commentName;

    @Column(name = "email")
    @NotBlank
    @Email
    @Size(min = 4, max = 50)
    private String commentEmail;

    @Column(name = "body")
    @NotBlank
    @Size(min = 10, message = "Comment body must be minimum 15 characters")
    private String commentBody;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Comment(@NotBlank @Size(min = 10, message = "Comment body must be minimum 15 characters")
                           String commentBody) {
        this.commentBody = commentBody;
    }

    @JsonIgnore
    public Post getPost(){
        return post;
    }

    @JsonIgnore
    public User getUser(){
        return user;
    }
}
