/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecases;

import interfaces.Descontavel;

/**
 *
 * @author ALUNO
 */
public class DarDesconto {
    
    private Descontavel desconto;
    private float precoBruto;

    public DarDesconto(Descontavel desconto, float precoBruto) {
        this.desconto = desconto;
        this.precoBruto = precoBruto;
    }
    
    public float GerarPrecoaPagar(){
        return this.precoBruto - this.desconto.calcularDesconto();
    }
    
}
