import java.sql.Connection;
import java.sql.PreparedStatement;
public class InsertTable {
    void insertProduct(String name) {
    String insertQuery = "insert into product(name) values(?);";
    try(    Connection con = DatabaseConnection.getConnection();
    PreparedStatement ps = con.prepareStatement(insertQuery))    {
        ps.setString(1, name);
        int rowInserted=ps.executeUpdate();
        System.out.println("No of rows inserted : "+rowInserted);
    }
    catch (Exception e){
        System.out.println("Exception caught : "+e);
    }
}
}