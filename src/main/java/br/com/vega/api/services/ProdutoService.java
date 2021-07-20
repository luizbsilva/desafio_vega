package br.com.vega.api.services;

import br.com.vega.api.dtos.ProdutoDTO;
import br.com.vega.api.model.Produto;

public interface ProdutoService {

    Iterable<Produto> getProdutos();

    Produto getByIdProdutos(Long id);

    Produto persistir(Produto produto);

    void deletar(Long id);

    Produto alterar(Produto produto);

    Produto validarAtualizacao(Long id, ProdutoDTO produtoDTO);

    Produto salvaProduto(ProdutoDTO produtoDTO);


}
