public class OracleConnection implements DatabaseConnection{
    @Override
    public OracleConnection getConnection() {
        return new OracleConnection();
    }
}
