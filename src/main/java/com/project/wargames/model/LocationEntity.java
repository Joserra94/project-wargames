package com.project.wargames.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_TRACE_SEQ")
    @SequenceGenerator(name = "ID_TRACE_SEQ", sequenceName = "ID_TRACE_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ADDRESS", length = 30, nullable = false)
    private String address;

    @Column(name = "COUNTRY", length = 30, nullable = false)
    private String country;

    @Column(name = "LATITUDE", length = 30, nullable = false)
    private String latitude;

    @Column(name = "LONGITUDE", length = 30, nullable = false)
    private String longitude;

}
