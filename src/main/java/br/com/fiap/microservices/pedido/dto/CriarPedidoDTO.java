package br.com.fiap.microservices.pedido.dto;


import br.com.fiap.microservices.pedido.model.ItemPedido;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record CriarPedidoDTO(
        @NotNull(message = "id do cliente é obrigatorio")
        Long clienteId,
        @NotEmpty(message = "Pedido deve ter pelo menos um item")
        List<ItemPedido> itens
) {
}
