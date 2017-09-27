/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Produto;
import persistence.DatabaseLocator;

/**
 *
 * @author luidgisarto
 */
public class ProdutoDAO {
    private static ProdutoDAO instancia;
    private static Connection conexao;
    private PreparedStatement opListaTodos;
    
    public ProdutoDAO() throws Exception {
        conexao = DatabaseLocator.getConnection();
        criarOperacoes();
    }

    public static ProdutoDAO getInstancia() {
        if (instancia == null) {
            try {
                instancia = new ProdutoDAO();
            } catch (Exception ex) {
                return null;
            }
        }
        return instancia;
    }

    public void criarOperacoes() throws Exception {
        try {
            opListaTodos = conexao.prepareStatement("SELECT * FROM Produto");
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
    }

    public List<Produto> listarTodos() throws Exception {
        List<Produto> produtos = new ArrayList<>();
        try {
            ResultSet resultado = opListaTodos.executeQuery();
            while (resultado.next()) {
                Produto p = new Produto();
                p.setCodigo(resultado.getInt("codigo"));
                p.setDescricao(resultado.getString("descricao"));
                p.setQuantidade(resultado.getInt("quantidade"));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
        return produtos;
    }
}
