package com.programandoSeuFuturo.jogos.repository;

import com.programandoSeuFuturo.jogos.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    public List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        this.jogos.add(new Jogo(1, "Forza Horizon 5", "Jogo de corrida, aventura e personalização", "https://upload.wikimedia.org/wikipedia/pt/d/dc/Capa_de_Forza_Horizon_5.jpg", 255.89, false));
        this.jogos.add(new Jogo(2, "Need for speed Heat", "Jogo de corrida, perseguição policial e personalização", "https://media.contentapi.ea.com/content/dam/need-for-speed/nfs-heat/images/2019/08/nsfh-hero-large-keyart-16x9-xl.jpg.adapt.crop1x1.320w.jpg", 239.65, false));
        this.jogos.add(new Jogo(3, "Overcooked", "Jogo de cozinha para jogar com os amigos", "https://upload.wikimedia.org/wikipedia/en/thumb/6/69/Overcooked_cover_art.jpg/220px-Overcooked_cover_art.jpg", 78.90, false));

    }

    public List<Jogo> findAll(){
        return jogos;
    }

    public Jogo save(Jogo jogo){
        for(Jogo jogoDaLista : jogos){
            if(jogoDaLista.getId() == jogo.getId()){
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;
    }
    public String delete(int id){
        for(Jogo jogo : jogos){
            if(jogo.getId() == id){
                jogos.remove(jogo);
                return "Jogo removido";
            }
        }
        return "Jogo inexistente";
    }

}
