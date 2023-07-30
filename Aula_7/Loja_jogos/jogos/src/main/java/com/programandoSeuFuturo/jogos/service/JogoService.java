package com.programandoSeuFuturo.jogos.service;

import com.programandoSeuFuturo.jogos.model.Jogo;
import com.programandoSeuFuturo.jogos.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Jogo> getAll(){
        return bancoDeDados.findAll();
    }
    public Jogo save(Jogo jogo){
        return bancoDeDados.save(jogo);
    }
    public String delete(int id){
        return bancoDeDados.delete(id);
    }
}
