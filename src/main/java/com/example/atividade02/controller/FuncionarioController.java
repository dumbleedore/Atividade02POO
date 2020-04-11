package com.example.atividade02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.atividade02.entity.Funcionario;

@Controller
public class FuncionarioController {
@GetMapping("/cadastro")
public String cadastro()
{
    return "cadastro";
}

@PostMapping("/funcionario")
public ModelAndView Funcionario(@ModelAttribute Funcionario funcionario)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException
{
    ModelAndView mv = new ModelAndView("/funcionario");
    mv.addObject("funcionario", funcionario);
    return mv;
}



}