/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.*;


public class AgendamentoM {
    private String DpCliente;
    private String DpDentista;
    private String Data;
    private String Horario;

    public AgendamentoM(String DpCliente, String DpDentista, String Data, String Horario) {
        this.DpCliente = DpCliente;
        this.DpDentista = DpDentista;
        this.Data = Data;
        this.Horario = Horario;
    }

    public String getDpCliente() {
        return DpCliente;
    }

    public void setDpCliente(String DpCliente) {
        this.DpCliente = DpCliente;
    }

    public String getDpDentista() {
        return DpDentista;
    }

    public void setDpDentista(String DpDentista) {
        this.DpDentista = DpDentista;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

   
}
