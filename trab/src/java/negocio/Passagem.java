/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  negocio;
import negocio.Cliente;
import negocio.Pagamento;
import negocio.checkin;
import negocio.Voo;
/**
 *
 * @author YAN
 */
public class Passagem {
    private String codigoPassagem;
    private Cliente cliente;
    private Voo voo;
    private String classe;

    public Passagem(String codigoPassagem, Cliente cliente, Voo voo, String classe) {
        this.codigoPassagem = codigoPassagem;
        this.cliente = cliente;
        this.voo = voo;
        this.classe = classe;
    }

    public String getCodigoPassagem() {
        return codigoPassagem;
    }

    public void setCodigoPassagem(String codigoPassagem) {
        this.codigoPassagem = codigoPassagem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
}
