package br.com.fiap.microservices.pedido.service;


import br.com.fiap.microservices.pedido.dto.ClienteDTO;
import br.com.fiap.microservices.pedido.dto.CriarPedidoDTO;
import br.com.fiap.microservices.pedido.feign.CatalogoFeignClient;
import br.com.fiap.microservices.pedido.feign.ClienteFeignClient;
import br.com.fiap.microservices.pedido.model.Pedido;
import br.com.fiap.microservices.pedido.repository.PedidoRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
public class PedidoService {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(PedidoService.class);
    private final PedidoRepository pedidoRepository;
    private final CatalogoFeignClient catalogoFeignClient;
    private final ClienteFeignClient clienteFeignClient;

    public PedidoService(PedidoRepository pedidoRepository,
                         CatalogoFeignClient catalogoFeignClient,
                         ClienteFeignClient clienteFeignClient){
        this.pedidoRepository = pedidoRepository;
        this.catalogoFeignClient = catalogoFeignClient;
        this.clienteFeignClient = clienteFeignClient;
    }

    @Transactional
    public Pedido criar(CriarPedidoDTO dto){
        logger.info("Criando novo pedido para cliente Id: {}");
    }
}
