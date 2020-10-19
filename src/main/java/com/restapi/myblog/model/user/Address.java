package com.restapi.myblog.model.user;
/**
 * @author Tega Isiboge
 * */

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
@Table(name = "address")
public class Address extends UserDateAudit {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressid;

    @Column(name = "street")
    private String street;

    @Column(name = "suite")
    private String suite;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private String zipcode;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "geo_id")
    private GeoLocation geoLocation;

    @OneToOne(mappedBy = "address")
    private User user;

    public Address(String street, String suite, String city, String zipcode){
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
//        this.geoLocation = geoLocation;
    }

    @JsonIgnore
    public Long getAddressid(){
        return addressid;
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
    public Long getUpdatedBy() {
        return super.getUpdatedBy();
    }

    @JsonIgnore
    @Override
    public void setUpdatedBy(Long updatedBy) {
        super.setUpdatedBy(updatedBy);
    }

    @JsonIgnore
    @Override
    public Instant getCreatedAt() {
        return super.getCreatedAt();
    }

    @JsonIgnore
    @Override
    public void setCreatedAt(Instant createdAt) {
        super.setCreatedAt(createdAt);
    }

    @JsonIgnore
    @Override
    public Instant getUpdatedAt() {
        return super.getUpdatedAt();
    }

    @JsonIgnore
    @Override
    public void setUpdatedAt(Instant updatedAt) {
        super.setUpdatedAt(updatedAt);
    }
}
