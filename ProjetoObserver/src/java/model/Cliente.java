/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author luidgisarto
 */
public class Cliente implements Observer {

    private int codigo;
    private String nome;
    private String email;
    Observable produto;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (produto instanceof Produto) {
            Produto produtoLoja = (Produto) produto;
            String produtoEstoque = produtoLoja.getDescricao();
            System.out.println("O produto" + produtoEstoque + " encontra-se disponível para compra");
        }
    }

}
