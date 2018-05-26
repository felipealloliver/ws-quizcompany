package com.faculdade.quizcompany.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Resposta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idResposta

    @ManyToOne
    Empresa empresa

    @ManyToOne
    Pergunta pergunta

    Long valorAtual
    Long valorDesejado
}
