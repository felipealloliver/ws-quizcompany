package com.faculdade.quizcompany.entity

import com.sun.javafx.geom.transform.Identity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Empresa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idEmpresa

    @Column(length = 100)
    String nomeEmpresa

    @Column(length = 100)
    String pessoaEntrevistada

    @Column(length = 100)
    String entrevistador
}
