/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author alexsandro
 */
/*
 * ConnectDB.java
 *
 * Created on 05 de Abril de 2008, 10:50
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


  import java.sql.*;

/**
 *
 * @author Alexsandro Monteiro Carneiro
 */
public class Conexao {
    // Objeto de COnexão com BD
    private Connection conn;
    // Objeto de Consulta SQL
    static public Statement stmt;
    // Objeto com dados SQL
    private ResultSet res;
    static public ResultSet resultado=null;
    //contador de tuplas
    private int affectRows;
    /** Creates a new instance of ConnectDB */
    public Conexao() {
    }
    //Função de Conexão com PostgreSQL via JDBC
    public void ConectaBD(){
       try
       {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/AtividadeEmGrupoParad","postgres", "ucdb");
        System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
       try{
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
       }catch(Exception e){
           System.out.println("Falha no Cursor de Execução");
           e.printStackTrace();
       }
       
    }
       
    
    public Connection getConnection(){
        return conn;
    }
    
    public Statement getStatement(){
        return stmt;
    }                
    
  public void destroy(){
    if(conn !=null){
         try{
               conn.close();
         } catch(Exception e){}
    }
  } 
  
}
