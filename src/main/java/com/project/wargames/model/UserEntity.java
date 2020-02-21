package com.project.wargames.model;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_TRACE_SEQ")
    @SequenceGenerator(name = "ID_TRACE_SEQ", sequenceName = "ID_TRACE_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", length = 30, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 30, nullable = false)
    private String surname;

    @Column(name = "USERNAME", length = 30, nullable = false)
    private String username;

    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    @Column(name = "PHONE_PREFIX", length = 3)
    private String phonePrefix;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private LocationEntity location;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE")
    private Date date;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MembershipEntity> memberships;
}
