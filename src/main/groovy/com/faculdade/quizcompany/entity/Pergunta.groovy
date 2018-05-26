package com.faculdade.quizcompany.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Pergunta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idPergunta

    @Column(length = 4)
    String escopo

    String pergunta
}
