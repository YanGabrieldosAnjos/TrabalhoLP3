/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author YAN
 */
public class Pagamento {
    private float valor;
    private int parcelamento;
    private String cartao;
    private  String senha;

    public Pagamento(float valor, int parcelamento, String cartao, String senha) {
        this.valor = valor;
        this.parcelamento = parcelamento;
        this.cartao = cartao;
        this.senha = senha;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
