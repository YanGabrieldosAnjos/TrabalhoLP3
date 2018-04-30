/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.Date;
/**
 *
 * @author YAN
 */
public class Cliente {
    private String  cpf;
    private String  nome;
    private String  email;
    private  Date nascimento;
    private String telefone;
    public Cliente(String cpf, String nome, String email, Date nascimento, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   public int  inserir(){
       return   0;
   }
   public int  consultar(){
       return   0;
   }
   public int  alterar(){
       return   0;
   }   
}
