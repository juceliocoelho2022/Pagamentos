package br.com.JucelioCoelhoFood.pagamentos.repository;

import br.com.JucelioCoelhoFood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentosRepository extends JpaRepository<Pagamento, Long> {
}
