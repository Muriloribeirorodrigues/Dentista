/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Conexao.Conexao;
import Modelo.AgendamentoM;
import java.sql.ResultSet;

/**
 *
 * @author guto4
 */
public class AgendamentoC {
        Conexao conecta= new Conexao();
    public void CadastroAgendamento(AgendamentoM objeto){
        try{
            conecta.ConectaBD();
            String sql=" INSERT INTO Agendamento (fk_DadosPessoaisClientes_CPF,fk_DadosPessoaisDentistas_CPF,dia,Horario) VALUES('"+objeto.getDpCliente()+"','"+objeto.getDpDentista()+"','"+objeto.getData()+"','"+objeto.getHorario()+"')";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    public ResultSet ConsultaGeralAgendamento()
    {
     ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="SELECT Agendamento.id_agendamento,DadosPessoaisClientes.Nome,DadosPessoaisDentistas.nome,Agendamento.dia,Agendamento.Horario from Agendamento,DadosPessoaisDentistas,DadosPessoaisClientes where Agendamento.fk_DadosPessoaisClientes_CPF = DadosPessoaisClientes.CPF and Agendamento.fk_DadosPessoaisDentistas_CPF = DadosPessoaisDentistas.CPF;";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
    public ResultSet ConsultaPorCPFAgendamentoClientes(String CPF){
             ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="SELECT Agendamento.id_agendamento,DadosPessoaisClientes.Nome,DadosPessoaisDentistas.nome,Agendamento.dia,Agendamento.Horario from Agendamento,DadosPessoaisDentistas,DadosPessoaisClientes where Agendamento.fk_DadosPessoaisClientes_CPF = DadosPessoaisClientes.CPF and Agendamento.fk_DadosPessoaisDentistas_CPF = DadosPessoaisDentistas.CPF and fk_DadosPessoaisClientes_CPF = '"+CPF+"';";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
    
    public void AtualizaAgendamentoDiaClientes(String id_agendamento,String dia){
        try{
            conecta.ConectaBD();
            String sql="update Agendamento set dia = '"+dia+"' where id_agendamento = '"+id_agendamento+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }       
    }       
        public void AtualizaAgendamentoHoarioClientes(String id_agendamento,String Horario){
        try{
            conecta.ConectaBD();
            String sql="update Agendamento set Horario = '"+Horario+"' where id_agendamento = '"+id_agendamento+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }       
    } 
    
        public void AtualizaAgendamentoDentistasClientes(String id_agendamento, String CPF){

        try{
            conecta.ConectaBD();
            String sql="update Agendamento set fk_DadosPessoaisDentistas_CPF = '"+CPF+"' where id_agendamento = '"+id_agendamento+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }       

        }  
    
    
    
     public ResultSet ConsultaPorCPFAgendamentoDentistas(String CPF){
             ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="SELECT Agendamento.id_agendamento,DadosPessoaisClientes.Nome,DadosPessoaisDentistas.nome,Agendamento.dia,Agendamento.Horario from Agendamento,DadosPessoaisDentistas,DadosPessoaisClientes where Agendamento.fk_DadosPessoaisClientes_CPF = DadosPessoaisClientes.CPF and Agendamento.fk_DadosPessoaisDentistas_CPF = DadosPessoaisDentistas.CPF and fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
     public void DeletarAgendamento(String id_agendamento){
        try{
            conecta.ConectaBD();
            String sql="Delete from Agendamento where id_agendamento = '" +id_agendamento+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
}
