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
public class Cliente {
    private String nome;
    private String cpf;
    private int pontuacao;

    public Cliente(String nome, String cpf, int pontuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    
    
}
