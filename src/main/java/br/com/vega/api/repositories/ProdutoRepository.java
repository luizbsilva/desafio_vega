package br.com.vega.api.repositories;

import br.com.vega.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
