import java.sql.*;

public class JavaData {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "system", "system"
            );
            System.out.println("Connection Established");

            st = con.createStatement();
            st.execute("CREATE TABLE EMP(EMP_NO INT PRIMARY KEY, ENAME VARCHAR(10))");
            System.out.println("Table Created");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
