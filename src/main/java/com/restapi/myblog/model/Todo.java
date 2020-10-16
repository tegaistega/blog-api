package com.restapi.myblog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.myblog.model.audit.UserDateAudit;
import com.restapi.myblog.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "todos", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class Todo extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoid;

    @NotBlank
    @Column(name = "title")
    private String todoTitle;

    @Column(name = "completed")
    private Boolean todoCompleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnore
    public User getUser() {
        return user;
    }
}
