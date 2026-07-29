/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class EnderecoM {
    private String CPF;
    private String Estado;
    private String Cidade;
    private String cep;
    private String Bairro;
    private String Rua;
    private int Numero;

    public EnderecoM(String CPF, String Estado, String Cidade, String cep, String Bairro, String Rua, int Numero) {
        this.CPF = CPF;
        this.Estado = Estado;
        this.Cidade = Cidade;
        this.cep = cep;
        this.Bairro = Bairro;
        this.Rua = Rua;
        this.Numero = Numero;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    
}