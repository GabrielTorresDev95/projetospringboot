package io.github.gabrielzi.Services;

import io.github.gabrielzi.model.Cliente;
import io.github.gabrielzi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {


        private ClienteRepository repository;

        public ClientesService( ClienteRepository repository ){
            this.repository = repository;
        }

        public void salvarCliente(Cliente cliente){
            validarCliente(cliente);
            this.repository.persistir(cliente);
        }

        public void validarCliente(Cliente cliente){
            //aplica validações
        }
    }
