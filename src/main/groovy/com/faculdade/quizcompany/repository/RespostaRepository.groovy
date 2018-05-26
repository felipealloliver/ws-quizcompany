package com.faculdade.quizcompany.repository

import com.faculdade.quizcompany.entity.Resposta
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface RespostaRepository extends PagingAndSortingRepository<Resposta, Long> {

}