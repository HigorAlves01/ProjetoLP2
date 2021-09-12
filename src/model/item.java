/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class item {
    private String nome;
    private double valor;
    private int estadoitem;
    public item()
            {
                nome= new String();
                valor = 0;
                estadoitem =0;
            }

    public item(String nome, double valor, int estadoitem) {
        this.nome = nome;
        this.valor = valor;
        this.estadoitem = estadoitem;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstadoitem() {
        return estadoitem;
    }

    public void setEstadoitem(int estadoitem) {
        this.estadoitem = estadoitem;
    }
    
}
