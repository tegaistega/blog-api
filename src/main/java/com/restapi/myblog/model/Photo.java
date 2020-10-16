package com.restapi.myblog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.myblog.model.audit.UserDateAudit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "photos", uniqueConstraints = { @UniqueConstraint(columnNames = { "title" }) })
public class Photo extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoid;

    @NotBlank
    @Column(name = "title")
    private String photoTitle;

    @NotBlank
    @Column(name = "url")
    private String photoUrl;

    @NotBlank
    @Column(name = "thumbnail_url")
    private String photoThumbnailUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "album_id")
    private Album album;

    public Photo(@NotBlank String photoTitle, @NotBlank String photoUrl,
                 @NotBlank String photoThumbnailUrl, Album album) {
        this.photoTitle = photoTitle;
        this.photoUrl = photoUrl;
        this.photoThumbnailUrl = photoThumbnailUrl;
        this.album = album;
    }

    @JsonIgnore
    public Album getAlbum(){
        return album;
    }
}