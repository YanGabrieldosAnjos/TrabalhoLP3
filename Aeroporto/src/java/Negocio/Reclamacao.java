/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Banco.ReclamacaoDAO;
/**
 *
 * @author YAN
 */
public class Reclamacao {
    private String idPassagem;
    private String reclamacao;
    private String data;

    public Reclamacao(String idPassagem, String reclamacao, String data) {
        this.idPassagem = idPassagem;
        this.reclamacao = reclamacao;
        this.data = data;
    }

    public String getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(String idPassagem) {
        this.idPassagem = idPassagem;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public boolean insere(){
        ReclamacaoDAO r= new ReclamacaoDAO();
        return r.incluir(this);
    }
}
