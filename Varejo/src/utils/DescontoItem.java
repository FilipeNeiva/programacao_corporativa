/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import interfaces.Descontavel;
import model.Compra;

/**
 *
 * @author ALUNO
 */
public class DescontoItem implements Descontavel{
    
    private Compra compra;
    private float desconto;

    public DescontoItem(Compra compra) {
        this.compra = compra;
        desconto = 0;
    }

    @Override
    public float calcularDesconto() {
        for(int i = 0; i < this.compra.getItens().size(); i++){
            if(this.compra.getItens().get(i).getQuantidade() > 20){
                desconto += this.compra.getItens().get(i).getPreco() * 0.1;
            }
        }
        return this.desconto;
    }
    
    
    
}
