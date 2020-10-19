package com.restapi.myblog.model.role;
/**
 * @author Tadi's
 * Tega Isiboge
 * */
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleid;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name = "name")
    private RoleEnum roleAssignment;

    public Role(RoleEnum roleAssignment){
        this.roleAssignment = roleAssignment;
    }
}
