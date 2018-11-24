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
public class Produto {
    private String nome;
    private float valor;

    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public float getValor(){
        return this.valor;
    }
    
}
