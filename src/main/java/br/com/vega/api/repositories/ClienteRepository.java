package br.com.vega.api.repositories;

import br.com.vega.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByEmail(String email);

    Cliente findByCpfOrEmail(String cpf, String email);

    Cliente findByCpf(String cpf);

    List<Cliente> findByNomeIgnoreCaseContaining(String nome);
}
