package database;
import java.sql.DriverManager;

public class koneksidb {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksidb(){
       if (koneksi == null) {
           try {
               String url = "jdbc:mysql://localhost:3306/db_koneksijava";
               String user = "root";
               String password = "";
               DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
               koneksi = DriverManager.getConnection(url, user, password);
               System.out.println("Berhasil Terhubung");
           } catch (Exception e) {
               System.out.println("Error");
           }
       }
       return koneksi;
        
        
    }
    public static void main(String args[]){
        getkoneksidb();
    }
}
    

