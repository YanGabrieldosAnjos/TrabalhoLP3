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
public class Reclamacao {
    private String identificador;
    private String descricao;
    private Date  data;
    private String situacao;

    public Reclamacao(String identificador, String descricao, Date data, String situacao) {
        this.identificador = identificador;
        this.descricao = descricao;
        this.data = data;
        this.situacao = situacao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    
}
