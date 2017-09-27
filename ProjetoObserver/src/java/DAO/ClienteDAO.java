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
import persistence.DatabaseLocator;

/**
 *
 * @author luidgisarto
 */
public class ClienteDAO {

    private static ClienteDAO instancia;
    private static Connection conexao;
    private PreparedStatement opListaTodos;
    private PreparedStatement opSalvar;
    private PreparedStatement opAtualizar;
    private PreparedStatement opExcluir;
    private PreparedStatement opBuscarPorId;
    private PreparedStatement opBuscarProduto;

    public ClienteDAO() throws Exception {
        conexao = DatabaseLocator.getConnection();
        criarOperacoes();
    }

    public static ClienteDAO getInstancia() {
        if (instancia == null) {
            try {
                instancia = new ClienteDAO();
            } catch (Exception ex) {
                return null;
            }
        }
        return instancia;
    }

    public void criarOperacoes() throws Exception {
        try {
            opListaTodos = conexao.prepareStatement("SELECT * FROM Cliente");
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
    }
    
    public List<Cliente> listarTodos() throws Exception {
        List<Cliente> clientes = new ArrayList<>();
        try {
            ResultSet resultado = opListaTodos.executeQuery();
            while (resultado.next()) {
                Cliente c = new Cliente();
                c.setCodigo(resultado.getInt("codigo"));
                c.setNome(resultado.getString("nome"));
                c.setEmail(resultado.getString("email"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            throw new Exception(ex);
        }
        return clientes;
    }
}
