package com.faculdade.quizcompany.repository

import com.faculdade.quizcompany.entity.Empresa
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpresaRepository extends PagingAndSortingRepository<Empresa, Long> {

}