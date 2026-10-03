package br.com.fiap.microservices.pedido.repository;


import br.com.fiap.microservices.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<Pedido, Long> {

}
