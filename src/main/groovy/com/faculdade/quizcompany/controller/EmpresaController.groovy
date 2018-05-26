package com.faculdade.quizcompany.controller

import com.faculdade.quizcompany.entity.Empresa
import com.faculdade.quizcompany.repository.EmpresaRepository
import org.dom4j.rule.Mode
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/")
class EmpresaController {
    @Autowired
    EmpresaRepository empresaRepository

    @GetMapping
    ModelAndView cadastroEmpresa() {
        Empresa novaEmpresa
        ModelAndView modelAndView = new ModelAndView("index")
    }
}
