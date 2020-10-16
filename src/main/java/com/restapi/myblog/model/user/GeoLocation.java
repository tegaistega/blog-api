package com.restapi.myblog.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.myblog.model.audit.UserDateAudit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@Table(name = "geo")
public class GeoLocation extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lat")
    private String latitude;

    @Column(name = "lng")
    private String longitude;

    @OneToOne(mappedBy = "geo")
    private Address address;

    public GeoLocation(String latitude, String longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @JsonIgnore
    @Override
    public Long getCreatedBy(){
        return super.getCreatedBy();
    }

    @JsonIgnore
    @Override
    public void setCreatedBy(Long createdBy){
        super.setCreatedBy(createdBy);
    }

    @JsonIgnore
    @Override
    public Long getUpdatedBy(){
        return super.getUpdatedBy();
    }

    @JsonIgnore
    @Override
    public void setUpdatedBy(Long updatedBy){
        super.setUpdatedBy(updatedBy);
    }

    @JsonIgnore
    @Override
    public Instant getCreatedAt(){
        return super.getCreatedAt();
    }

    @JsonIgnore
    @Override
    public void setCreatedAt(Instant createdAt){
        super.setCreatedAt(createdAt);
    }

    @JsonIgnore
    @Override
    public Instant getUpdatedAt(){
        return super.getUpdatedAt();
    }

    @JsonIgnore
    @Override
    public void setUpdatedAt(Instant updatedAt){
        super.setUpdatedAt(updatedAt);
    }

}
