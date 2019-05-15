package PacoteBD;
import java.sql.*;

public class Conexao {
    
	public static Connection abrirConexao() {
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
         
            String url = "jdbc:mysql://127.0.0.1/mercadinho?"
                    + "user=root&password=etecia";
            
            con = DriverManager.getConnection(url);
            
                System.out.println("Conxão aberta com sucessfull");
        } 
        
        catch(SQLException e){  
        } 
        catch (ClassNotFoundException e){    
        } 
        catch (Exception e){  
        }  
        
        return con;
      }
        
       public static void fecharConexao (Connection con){
           try{
               con.close();
               
               System.out.println("Fechada a conexão");
           }
           catch (SQLException e){
           }
           catch (Exception e){
               
           }
       }
        
}
	

