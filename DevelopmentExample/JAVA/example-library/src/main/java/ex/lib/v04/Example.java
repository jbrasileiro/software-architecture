package ex.lib.v04;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class Example {

    private final DataSource dataSource;

    public Example(
        final DataSource dataSource) {
        super();
        this.dataSource = dataSource;
    }

    public String execute() {
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT COUNT(*) FROM EXAMPLE");
            Long count = statement.getResultSet().getLong(0);
            return "Total of ".concat(count.toString());
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
