/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ALUNO
 */
public class ItemCompra {
    private Produto produto;
    private int quantidade;
    private float preco;

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = this.produto.getValor() * this.quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
    
    
    
}
