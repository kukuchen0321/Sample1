public class MySqlConnection implements DatabaseConnection{
    @Override
    public MySqlConnection getConnection() {
        return new MySqlConnection();
    }
}
