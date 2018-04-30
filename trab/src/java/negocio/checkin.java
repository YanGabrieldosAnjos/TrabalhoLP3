/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import  java.util.Date;
/**
 *
 * @author YAN
 */
public class checkin {
    private String   codCheckin;
    private String  codPassagem;
    private Date hora;

    public checkin(String codCheckin, String codPassagem, Date hora) {
        this.codCheckin = codCheckin;
        this.codPassagem = codPassagem;
        this.hora = hora;
    }

    public String getCodCheckin() {
        return codCheckin;
    }

    public void setCodCheckin(String codCheckin) {
        this.codCheckin = codCheckin;
    }

    public String getCodPassagem() {
        return codPassagem;
    }

    public void setCodPassagem(String codPassagem) {
        this.codPassagem = codPassagem;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
}
