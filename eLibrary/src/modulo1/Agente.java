package modulo1;

import java.sql.*;


public class Agente {	

    protected static Agente mInstancia=null;
    protected static Connection mBD;
    private static String url="jdbc:odbc:eLibrary";    
    private static String driver="sun.jdbc.odbc.JdbcOdbcDriver";
    
    private Agente()throws Exception {    	
    	conectar();    		
    }
 
     public static Agente getAgente() throws Exception{
    	 mInstancia=null;
    	
    	 if (mInstancia==null){   
    		 
          mInstancia=new Agente();
          
        }    	
        return mInstancia;
     } 
   
    private void conectar() throws Exception {       	
    	Class.forName(driver); 
         mBD=DriverManager.getConnection(url);        
    }     
   
    public void desconectar() throws Exception{
    	mBD.close();    	
    }
    
    public int insert(String SQL) throws SQLException, Exception{ 
     	
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	  
    	stmt.close();
    	desconectar();
    	return res;
    }    
    
    public int delete(String SQL) throws SQLException,Exception{
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }    
    
    public int update(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close(); 
    	desconectar();
       	return res;
    }    
    
	public ResultSet select(String SQL) throws SQLException,Exception{			
		
	  PreparedStatement stmt=mBD.prepareStatement(SQL);		  	
	  ResultSet rs = stmt.executeQuery();     
	    
	  return rs;				  
   }
	
}