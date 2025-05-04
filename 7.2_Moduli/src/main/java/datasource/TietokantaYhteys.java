package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TietokantaYhteys {
    private static final String URL = "jdbc:mariadb://localhost:3306/currency_converter";
    private static final String KAYTTAJA = "appuser";
    private static final String SALASANA = "1234!";

    public static Connection getYhteys() throws SQLException {
        return DriverManager.getConnection(URL, KAYTTAJA, SALASANA);
    }
}