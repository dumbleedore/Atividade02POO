package com.example.atividade02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.atividade02.entity.Funcionario;
import com.example.atividade02.service.FuncionarioService;

@Controller
public class FuncionarioController {
    @Autowired
    private FuncionarioService fs;


    @GetMapping("/cadastro")
    public String cadastro()
    {
        return "cadastro";
    }

    @PostMapping("/funcionario")
    public ModelAndView Funcionario(@ModelAttribute Funcionario funcionario)

    {
        ModelAndView mv = new ModelAndView("/funcionario");
        mv.addObject("funcionario", funcionario);
        fs.AddFuncionario(funcionario);
        

        
        return mv;
    }
    @GetMapping("/funcionarios")
    public ModelAndView Funcionarios()
    {
        ModelAndView mv = new ModelAndView("/funcionarios");
        mv.addObject("funcionarios", fs.ListaFuncionario());
        return mv;
    }



}