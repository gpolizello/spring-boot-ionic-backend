package com.polizello.server;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.polizello.server.domain.Categoria;
import com.polizello.server.domain.Cidade;
import com.polizello.server.domain.Cliente;
import com.polizello.server.domain.Endereco;
import com.polizello.server.domain.Estado;
import com.polizello.server.domain.ItemPedido;
import com.polizello.server.domain.Pagamento;
import com.polizello.server.domain.PagamentoComBoleto;
import com.polizello.server.domain.PagamentoComCartao;
import com.polizello.server.domain.Pedido;
import com.polizello.server.domain.Produto;
import com.polizello.server.domain.enums.EstadoPagamento;
import com.polizello.server.domain.enums.TipoCliente;
import com.polizello.server.repositories.CategoriaRepository;
import com.polizello.server.repositories.CidadeRepository;
import com.polizello.server.repositories.ClienteRepository;
import com.polizello.server.repositories.EnderecoRepository;
import com.polizello.server.repositories.EstadoRepository;
import com.polizello.server.repositories.ItemPedidoRepository;
import com.polizello.server.repositories.PagamentoRepository;
import com.polizello.server.repositories.PedidoRepository;
import com.polizello.server.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
