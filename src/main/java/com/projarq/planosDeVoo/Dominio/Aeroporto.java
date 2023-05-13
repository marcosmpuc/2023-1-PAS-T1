package com.projarq.planosDeVoo.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aeroporto {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String localidade;

    Aeroporto(Long id, String localidade) {}
    
    public Long getId() {
        return this.id;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    // Obrigatório para geração automática dos id's pela JPA
	protected Aeroporto() {}

    @Override
    public String toString() {
        return "Aeroporto{" + "id=" + id + ", localidade='" + localidade + '\'' + '}';
    }
}
