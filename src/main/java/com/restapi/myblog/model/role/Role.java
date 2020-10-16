package com.restapi.myblog.model.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

/**
 * @author Tadi's
 * Tega Isiboge
 * */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
