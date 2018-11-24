/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Compra {
    
    private List<ItemCompra> itens;
    private Cliente cliente;
    private float somatorioValorItens;

    public Compra(List<ItemCompra> itens, Cliente cliente) {
        this.itens = itens;
        this.cliente = cliente;
    }

    public Compra(Cliente cliente, float somatorioValorItens) {
        this.cliente = cliente;
        this.somatorioValorItens = somatorioValorItens;
    }
    
    public void addItem(ItemCompra item){
        this.itens.add(item);
    }
    
    public float getSomatorioValorItens(){
        this.somatorioValorItens = 0;
        for(int i = 0; i < this.itens.size(); i++){
            this.somatorioValorItens += this.itens.get(i).getPreco();
        }
        return this.somatorioValorItens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    
    
    
}
