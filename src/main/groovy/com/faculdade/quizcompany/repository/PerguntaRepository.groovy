package com.faculdade.quizcompany.repository

import com.faculdade.quizcompany.entity.Pergunta
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface PerguntaRepository extends PagingAndSortingRepository<Pergunta, Long> {

}