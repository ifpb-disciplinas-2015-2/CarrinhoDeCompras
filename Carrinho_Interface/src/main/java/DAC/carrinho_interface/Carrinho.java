/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAC.carrinho_interface;

import java.util.List;

/**
 *
 * @author Antonio Junior
 */
public interface Carrinho {
    public void addItem(String item);
    public void remItem(String item);
    public List<String> listarItens();
    public void finalizar();
}
