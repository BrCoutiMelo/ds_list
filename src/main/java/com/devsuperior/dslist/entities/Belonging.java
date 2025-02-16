package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "TB_Belonging")
public class Belonging { //Para definir Qual Jogo pertence a Qual Lista

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private int position;

    public Belonging(){

    }

    public Belonging(Game game, GameList list, int position) {
        id.setGame(game);
        id.setGameList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}