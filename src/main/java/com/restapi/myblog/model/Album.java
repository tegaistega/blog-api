package com.restapi.myblog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.myblog.model.audit.UserDateAudit;
import com.restapi.myblog.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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
@Table(name = "albums", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class Album extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long albumid;

    @NotBlank
    @Column(name = "title")
    private String albumTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Photo> albumPhotos;

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public List<Photo> getAlbumPhotos(){
        return this.albumPhotos.isEmpty()
                || this.albumPhotos == null ? null : new ArrayList<>(this.albumPhotos);
    }

    public void setAlbumPhotos(List<Photo> albumPhotos){
        if(albumPhotos.isEmpty() || albumPhotos == null){
            this.albumPhotos = null;
        }else {
            this.albumPhotos = Collections.unmodifiableList(albumPhotos);
        }
    }

}
