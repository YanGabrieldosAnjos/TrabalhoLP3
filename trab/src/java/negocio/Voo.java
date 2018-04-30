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
public class Voo {
    private  String numeroVoo;
    private  int assentosEconomicos;
    private int  assentosPrimclasse;
    private String origem;
    private String destino;
    private String dtSaida;
    private String dtChegada;
    private String  horaSaida;
    private String horaChegada;

    public Voo(String numeroVoo, int assentosEconomicos, int assentosPrimclasse, String origem, String destino, String dtSaida, String dtChegada, String horaSaida, String horaChegada) {
        this.numeroVoo = numeroVoo;
        this.assentosEconomicos = assentosEconomicos;
        this.assentosPrimclasse = assentosPrimclasse;
        this.origem = origem;
        this.destino = destino;
        this.dtSaida = dtSaida;
        this.dtChegada = dtChegada;
        this.horaSaida = horaSaida;
        this.horaChegada = horaChegada;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getAssentosEconomicos() {
        return assentosEconomicos;
    }

    public void setAssentosEconomicos(int assentosEconomicos) {
        this.assentosEconomicos = assentosEconomicos;
    }

    public int getAssentosPrimclasse() {
        return assentosPrimclasse;
    }

    public void setAssentosPrimclasse(int assentosPrimclasse) {
        this.assentosPrimclasse = assentosPrimclasse;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getDtChegada() {
        return dtChegada;
    }

    public void setDtChegada(String dtChegada) {
        this.dtChegada = dtChegada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }
    public int consultar(){
        return   0;
    }
}
