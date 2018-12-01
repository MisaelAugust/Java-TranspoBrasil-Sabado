package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutos {

	public void inserirProduto(Produto produto) {
		String sql = "insert into produtos (nome,descricao,preco) values (?,?,?)";
		Connection conexao = BancoUtil.getConexao();
		try {
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());

			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();
			if (keys.next()) {
				Integer id = keys.getInt(1);
				produto.setId(id);
			}
			keys.close();
			comando.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Não foi possível inserir o produto.");
		}
	}

	public List<Produto> buscarProdutos() {
		List<Produto> lista = new ArrayList<>();
		String sql = "select * from produtos";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Produto produtos = null;
			while (cursor.next()) {
				produtos = criarProdutos(cursor);
				lista.add(produtos);
			}
			cursor.close();
			comando.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Não foi possível recuperar a lista de produtos.");
		}

		return lista;
	}

	private Produto criarProdutos(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String descricao = cursor.getString("descricao");
		double preco = cursor.getDouble("preco");
		return new Produto(id, nome, descricao, preco);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
