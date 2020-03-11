package com.example.atividade1.repository;

import java.util.HashMap;

import com.example.atividade1.model.Produto;

/**
 * ProdutosCadastrados
 */
public class ProdutosCadastrados {

    public HashMap<Integer,Produto> p = new HashMap<Integer,Produto>();

    public ProdutosCadastrados()
    {
        p.put(0,new Produto());
    }

}