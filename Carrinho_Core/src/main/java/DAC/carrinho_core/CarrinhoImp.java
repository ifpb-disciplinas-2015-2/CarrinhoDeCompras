/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAC.carrinho_core;

import DAC.carrinho_interface.Carrinho;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author Antonio Junior
 */
@Stateful
@Remote(Carrinho.class)
public class CarrinhoImp implements Carrinho, Serializable {

    private List<String> carrinho;

    public CarrinhoImp() {
        this.carrinho = new ArrayList<>();
    }

    @Override
    public void addItem(String item) {
        System.out.println("O item foi adicionado: " + item);
        carrinho.add(item);
    }

    @Override
    public void remItem(String item) {
        System.out.println("O item foi removido: " + item);
        carrinho.remove(item);
    }

    @Override
    public List<String> listarItens() {
        return carrinho;
    }

    @Remove
    @Override
    public void finalizar() {
        System.out.println("#####################################");
        System.out.println("Venda finalizada, com " + carrinho.size() + " item.");
        for (String item : carrinho) {
            System.out.println("Item: " + item);
        }
        System.out.println("#####################################");
    }
}
