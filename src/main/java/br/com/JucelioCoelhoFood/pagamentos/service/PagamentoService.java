package br.com.JucelioCoelhoFood.pagamentos.service;

import br.com.JucelioCoelhoFood.pagamentos.repository.PagamentosRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PagamentoService {
   private final PagamentosRepository repository;

   private final ModelMapper modelMapper;
}
