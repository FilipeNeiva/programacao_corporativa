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
public class DescontoCompra implements Descontavel{

    private Compra compra;

    public DescontoCompra(Compra compra) {
        this.compra = compra;
    }
    
    
    
    @Override
    public float calcularDesconto() {
        if(this.compra.getSomatorioValorItens() > 1000){
            return (float) (this.compra.getSomatorioValorItens() * 0.1);
        }else{
            return 0;
        }
    }
    
}
