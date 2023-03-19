package com.ap.ap.models;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Entity
@Table(name = "projects")
@Data
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_project")
    private Long idPro;

    @Column(length = 255, nullable = false, name = "title_project")
    private String titlePro;

    @Column(length = 500, nullable = false, name = "desc_project")
    private String descPro;

    @Column(length = 255, nullable = false, name = "link_project")
    private String linkPro;

    @Column(length = 255, nullable = false, name = "pic_project")
    private String picPro;

}