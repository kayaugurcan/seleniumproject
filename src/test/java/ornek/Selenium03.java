package ornek;

import org.junit.Assert;
import org.junit.Test;
import java.sql.*;

public class Selenium03   {

    public void initialize(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Mysql connector var");
        }catch(ClassNotFoundException e){
            System.out.println("Mysql connector yok");
            e.printStackTrace();
        }

        try {
            String name = "Selin";
            String surname = "Serman";
            float amount = 375;
            int receipt = 784856;



            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","");
            Statement st = con.createStatement();

            String query = "INSERT into dekont(name, surname, amount, receipt) VALUES('"+ name+ "','"+ surname+ "','"+ amount+ "','"+ receipt+ "')";
            st.executeUpdate(query);

            query= "SELECT * From dekont WHERE receipt="+receipt;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String data = rs.getString("receipt");
                if (Integer.toString(receipt).equals(data)){
                    System.out.println("Dekont numarası:"+data + " veritabanına başarı ile kaydedildi");
                }else{
                    Assert.fail("Kayıt Edilemedi");
                }

            }




        } catch (SQLException e) {
            System.out.println("Database baglantısı hatası");
            throw new RuntimeException(e);
        }


    }

    @Test
    public void databaseTest(){
        initialize();
    }
}
