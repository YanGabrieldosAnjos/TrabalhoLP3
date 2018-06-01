/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Banco.ClienteDAO;
/**
 *
 * @author YAN
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String dtNasc;
    private String email;

    public Cliente(String nome, String cpf, String dtNasc, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean logaCliente(){
        
        return true;
    }


}
