import java.sql.Connection;
import java.sql.Statement;
public class CreateTable {
    public void createTable(){
        String createTableSql= "Create table if not exists product(id int auto_increment primary key, name varchar(20) not null);";
                try(Connection connection=DatabaseConnection.getConnection();
                    Statement statement=connection.createStatement()){
                    statement.execute(createTableSql);
                    System.out.println("Table  employees created successfully");
                }
                catch (Exception e)
                {
                    System.out.println("Exception caught"+e);
                }
    }
}