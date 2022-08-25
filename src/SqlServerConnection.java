public class SqlServerConnection implements DatabaseConnection{
    @Override
    public SqlServerConnection getConnection() {
        return new SqlServerConnection();
    }
}
