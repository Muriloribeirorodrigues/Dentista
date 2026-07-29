/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author guto4
 */
public class DadosPessoaisM {
    private String Nome;
    private String CPF;
    private String Data_nasc;
    private String Contato;
    private char Sexo;

    public DadosPessoaisM(String Nome, String CPF, String Data_nasc, String Contato, char Sexo) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Data_nasc = Data_nasc;
        this.Contato = Contato;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getData_nasc() {
        return Data_nasc;
    }

    public void setData_nasc(String Data_nasc) {
        this.Data_nasc = Data_nasc;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
    
}
