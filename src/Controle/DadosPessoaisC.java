package Controle;

import Modelo.DadosPessoaisM;
import java.sql.ResultSet;
import Conexao.Conexao;

public class DadosPessoaisC {
    Conexao Conecta=new Conexao();
    
    public void CadastroGeralClientes(DadosPessoaisM obj){
        try{
            
            Conecta.ConectaBD();
            String sql="INSERT INTO DadosPessoaisClientes (CPF,NOME,DATA_NASC,CONTATO,SEXO) VALUES ('"+obj.getCPF()+"','"+obj.getNome()+"','"+obj.getData_nasc()+"','"+obj.getContato()+"','"+obj.getSexo()+"');";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    
        public void AtualizaClientesNome(String CPF,String Nome){
        try{
            
            Conecta.ConectaBD();
            String sql="UPDATE DadosPessoaisClientes set Nome = '"+Nome+"' where CPF = '"+CPF+"'";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
            public void AtualizaClientesContato(String CPF,String Contato){
        try{
            
            Conecta.ConectaBD();
            String sql="UPDATE DadosPessoaisClientes set Contato = '"+Contato+"' where CPF = '"+CPF+"'";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }

    
   public void DeletarRegistroClientes(String obj){
        try{
            
            Conecta.ConectaBD();
            String sql="Select DelCli('"+obj+"')";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    public ResultSet ConsultaGeralClientes(){
        ResultSet Dados=null;
        try{
            Conecta.ConectaBD();
            String sql="Select NOME,CPF,DATA_NASC,CONTATO,SEXO from DadosPessoaisClientes";
            Dados=Conecta.getStatement().executeQuery(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
        return Dados;
    }
     public ResultSet ConsultaPorCPFClientes(String cpf){
        ResultSet Dados=null;
        try{
            Conecta.ConectaBD();
            String sql="Select NOME,CPF,DATA_NASC,CONTATO,SEXO from DadosPessoaisClientes where CPF = '"+cpf+"'";
            Dados=Conecta.getStatement().executeQuery(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
        return Dados;
    }
     public void CadastroGeralDentistas(DadosPessoaisM obj){
        try{
            
            Conecta.ConectaBD();
            String sql="INSERT INTO DadosPessoaisDentistas (CPF,NOME,DATA_NASC,CONTATO,SEXO) VALUES ('"+obj.getCPF()+"','"+obj.getNome()+"','"+obj.getData_nasc()+"','"+obj.getContato()+"','"+obj.getSexo()+"');";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
   public void DeletarRegistroDentistas(String obj){
        try{
            Conecta.ConectaBD();
            String sql="SELECT DelDENT('"+obj+"')";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    public ResultSet ConsultaGeralDentistas(){
        ResultSet Dados=null;
        try{
            Conecta.ConectaBD();
            String sql="Select NOME,CPF,DATA_NASC,CONTATO,SEXO from DadosPessoaisDentistas";
            Dados=Conecta.getStatement().executeQuery(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
        return Dados;
    }
     public ResultSet ConsultaPorCPFDentistas(String cpf){
        ResultSet Dados=null;
        try{
            Conecta.ConectaBD();
            String sql="Select NOME,CPF,DATA_NASC,CONTATO,SEXO from DadosPessoaisDentistas where CPF = '"+cpf+"'";
            Dados=Conecta.getStatement().executeQuery(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
        return Dados;
    }
     
             public void AtualizaDentistaNome(String CPF,String Nome){
        try{
            
            Conecta.ConectaBD();
            String sql="UPDATE DadosPessoaisDentistas set Nome = '"+Nome+"' where CPF = '"+CPF+"'";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
        
            public void AtualizaDentistaContato(String CPF,String Contato){
        try{
            
            Conecta.ConectaBD();
            String sql="UPDATE DadosPessoaisDentistas set Contato = '"+Contato+"' where CPF = '"+CPF+"'";
            Conecta.getStatement().execute(sql);
            Conecta.destroy();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
}