package com.restapi.myblog.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.restapi.myblog.model.audit.UserDateAudit;
import com.restapi.myblog.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "posts", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Post extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postid;

    @Column(name = "title")
    private String postTitle;

    @Column(name = "body")
    private String postBody;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments;

    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "post_tag", joinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
    private List<Tag> tags;

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments == null ? null : new ArrayList<>(comments);
    }

    public void setComments(List<Comment> comments) {
        if (comments == null) {
            this.comments = null;
        } else {
            this.comments = Collections.unmodifiableList(comments);
        }
    }

    public List<Tag> getTags() {
        return tags == null ? null : new ArrayList<>(tags);
    }

    public void setTags(List<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            this.tags = Collections.unmodifiableList(tags);
        }
    }
}
