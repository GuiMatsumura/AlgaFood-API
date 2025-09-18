package com.algaworks.algafood;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService atividacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService atividacaoClienteService) {
        this.atividacaoClienteService = atividacaoClienteService;

        System.out.println("MeuPrimeiroController: " + atividacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao = new Cliente("João", "email@e.com", "21999999999");

        atividacaoClienteService.ativar(joao);

        return "Hellozada";
    }
}
