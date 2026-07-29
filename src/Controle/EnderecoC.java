/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.EnderecoM;
import java.sql.ResultSet;
import Conexao.Conexao;

public class EnderecoC {
      Conexao conecta= new Conexao();
    public void CadastroEnderecoDentistas(EnderecoM objeto){
        try{
            conecta.ConectaBD();
            String sql=" INSERT INTO EnderecoDentistas VALUES('"+objeto.getCPF()+"','"+objeto.getEstado()+"','"+objeto.getCidade()+"','"+objeto.getCep()+"','"+objeto.getBairro()+"','"+objeto.getRua()+"','"+objeto.getNumero()+"')";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    public ResultSet ConsultaGeralEndDentistas()
    {
     ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="Select DadosPessoaisDentistas.Nome,EnderecoDentistas.ESTADO, EnderecoDentistas.CIDADE, EnderecoDentistas.CEP, EnderecoDentistas.BAIRRO, EnderecoDentistas.RUA, EnderecoDentistas.NUMERO from EnderecoDentistas,DadosPessoaisDentistas WHERE EnderecoDentistas.fk_DadosPessoaisDentistas_CPF= DadosPessoaisDentistas.CPF";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
    public ResultSet ConsultaPorCPFDentistas(String CPF){
             ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="Select DadosPessoaisDentistas.Nome,EnderecoDentistas.ESTADO, EnderecoDentistas.CIDADE, EnderecoDentistas.CEP, EnderecoDentistas.BAIRRO, EnderecoDentistas.RUA, EnderecoDentistas.NUMERO from EnderecoDentistas,DadosPessoaisDentistas WHERE EnderecoDentistas.fk_DadosPessoaisDentistas_CPF= DadosPessoaisDentistas.CPF and DadosPessoaisDentistas.CPF = '"+CPF+"'";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
    
     public void DeletarEndDentistas(String CPF){
        try{
            conecta.ConectaBD();
            String sql="Delete from EnderecoDentistas where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }

     
     public void AtualizaDentistasEstado(String CPF,String Estado){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoDentistas set Estado = '"+Estado+"' where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
    public void AtualizaDentistasCidade(String CPF,String Cidade){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoDentistas set Cidade = '"+Cidade+"' where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }   
         
    public void AtualizaDentistasCep(String CPF,String Cep){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoDentistas set Cep = '"+Cep+"' where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
    public void AtualizaDentistasBairro(String CPF,String Bairro){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoDentistas set Bairro = '"+Bairro+"' where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
            
    public void AtualizaDentistasRua(String CPF,String Rua){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoDentistas set Rua = '"+Rua+"' where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
    public void AtualizaDentistasNumero(String CPF,int Numero){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoDentistas set Numero = "+Numero+" where fk_DadosPessoaisDentistas_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
     
    public void CadastroEnderecoClientes(EnderecoM objeto){
        try{
            conecta.ConectaBD();
            String sql=" INSERT INTO EnderecoClientes VALUES('"+objeto.getCPF()+"','"+objeto.getEstado()+"','"+objeto.getCidade()+"','"+objeto.getCep()+"','"+objeto.getBairro()+"','"+objeto.getRua()+"','"+objeto.getNumero()+"')";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    public ResultSet ConsultaGeralEndClientes()
    {
     ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="Select DadosPessoaisClientes.Nome,EnderecoClientes.ESTADO, EnderecoClientes.CIDADE, EnderecoClientes.CEP, EnderecoClientes.BAIRRO, EnderecoClientes.RUA, EnderecoClientes.NUMERO from EnderecoClientes,DadosPessoaisClientes WHERE EnderecoClientes.fk_DadosPessoaisClientes_CPF= DadosPessoaisClientes.CPF";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
    public ResultSet ConsultaPorCPFClientes(String CPF){
             ResultSet Dados=null;
        try{
            conecta.ConectaBD();
            String sql="Select DadosPessoaisClientes.Nome,EnderecoClientes.ESTADO, EnderecoClientes.CIDADE, EnderecoClientes.CEP, EnderecoClientes.BAIRRO, EnderecoClientes.RUA, EnderecoClientes.NUMERO from EnderecoClientes,DadosPessoaisClientes WHERE EnderecoClientes.fk_DadosPessoaisClientes_CPF= DadosPessoaisClientes.CPF and DadosPessoaisClientes.CPF = '"+CPF+"'";
            Dados=conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
             
     return Dados;
    }
    public void DeletarEndClientes(String CPF){
        try{
            conecta.ConectaBD();
            String sql="Delete from EnderecoClientes where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().executeQuery(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
         
         
    public void AtualizaClientesEstado(String CPF,String Estado){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoClientes set Estado = '"+Estado+"' where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
    public void AtualizaClientesCidade(String CPF,String Cidade){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoClientes set Cidade = '"+Cidade+"' where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }   
         
    public void AtualizaClientesCep(String CPF,String Cep){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoClientes set Cep = '"+Cep+"' where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
    public void AtualizaClientesBairro(String CPF,String Bairro){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoClientes set Bairro = '"+Bairro+"' where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
            
    public void AtualizaClientesRua(String CPF,String Rua){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoClientes set Rua = '"+Rua+"' where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
    public void AtualizaClientesNumero(String CPF,int Numero){
        try{
            
            conecta.ConectaBD();
            String sql="UPDATE EnderecoClientes set Numero = "+Numero+" where fk_DadosPessoaisClientes_CPF = '"+CPF+"'";
            conecta.getStatement().execute(sql);
            conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
}
