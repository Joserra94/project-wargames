package com.project.wargames.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
public class MembershipEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_TRACE_SEQ")
    @SequenceGenerator(name = "ID_TRACE_SEQ", sequenceName = "ID_TRACE_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

}
