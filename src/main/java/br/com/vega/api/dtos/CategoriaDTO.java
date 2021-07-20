package br.com.vega.api.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaDTO {

    private Long id;

    private String nomeCategoria;

    @Override
    public String toString() {
        return "CategoriaDTO [id=" + id + ", nomeCategoria=" + nomeCategoria + "]";
    }
}
