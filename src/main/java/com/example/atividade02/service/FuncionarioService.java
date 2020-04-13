package com.example.atividade02.service;

import java.util.ArrayList;

import com.example.atividade02.entity.Funcionario;
import com.example.atividade02.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository fr;


    public void AddFuncionario(Funcionario funcionario)
    {
        fr.save(funcionario);
    }
    
    public ArrayList<Funcionario> ListaFuncionario()
    {
        return (ArrayList<Funcionario>) fr.findAll();
    }

}