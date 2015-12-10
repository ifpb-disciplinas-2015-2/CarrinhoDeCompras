package com.mycompany.carrinhoweb;

import DAC.carrinho_interface.Carrinho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson Souza
 */
public class CarrinhoDeCompras implements Carrinho {
    private List<String> listaDeProdutos;

    public CarrinhoDeCompras() {
        listaDeProdutos = new ArrayList<>();
    }
    
    
    @Override
    public void addItem(String item) {
        listaDeProdutos.add(item);
    }

    @Override
    public void remItem(String item) {

    }

    @Override
    public List<String> listarItens() {
        return listaDeProdutos;
    }

    @Override
    public void finalizar() {
        
    }

}
