import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Exercicios4TryCatchDois {
    public static void main(String[] args) {
        String url = "jdbc:seu_driver://caminho/para/seu_banco_de_dados";
        String user = "seu_usuario";
        String password = "sua_senha";

        Connection conexao = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");

            st = conexao.createStatement();
            String sql = "SELECT * FROM sua_tabela";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String colunaTeste = rs.getString("coluna_teste");
                System.out.println(colunaTeste);
            }

            System.out.println("Consulta realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar a consulta: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar os recursos: " + e.getMessage());
            }
        }
    }
}
