package com.restapi.myblog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.myblog.model.audit.UserDateAudit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@NoArgsConstructor
@Table(name = "tags")
public class Tag extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagid;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "post_tag", joinColumns = @JoinColumn(name = "tag_id",
//            referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "post_id", referencedColumnName = "id"))
    private List<Post> posts;

    public Tag(String name){
        super();
        this.name = name;
    }

    public List<Post> getPosts(){
        return posts == null ? null : new ArrayList<>(posts);
    }

    public void setPosts(List<Post> posts){
        if(posts == null){
            this.posts = null;
        }else{
            this.posts = Collections.unmodifiableList(posts);
        }
    }
}
