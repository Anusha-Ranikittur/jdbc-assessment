package com.dxc.assessment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dxc.assessment.modal.Author;

public interface AuthorDao {

    private static final String INSERT_ONE_AUTHOR;

    private static final String SELECT_ALL_AUTHORS;

    private static final String USER_NAME;
    private static final String PASSWORD;
    private static final String URL;


    
    
    static{
        INSERT_ONE_AUTHOR = "INSERT INTO authors (id, first_name, last_name, genre, email) values (?, ?, ?, ?, ?)";
        SELECT_ALL_AUTHORS= "SELECT * FROM authors";

        USER_NAME = "root";
        PASSWORD = "password";

        
        URL = "jdbc:mysql://localhost:3306/dxc";
    }

    public AuthorDao(){
        
    public List<Author> findAll() throws SQLException{
        List<Author> authors = null;
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(SELECT_ALL_AUTHORS);
        authors = new ArrayList();
        while (rs.next()) {
            authors.add(new Author(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)))
        


    }
    rs.close();
    statement.close();
    connection.close();
    return authors;

    public int save(Author author) throws SQLException {
        System.out.println("Saving author: " + author);

    
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

        PreparedStatement ps = connection.prepareStatement(INSERT_ONE_AUTHOR);

        ps.setString(1, author.getid());
        ps.setString(2, author.getfirst_name());
        ps.setString(3, author.getlast_name());
        ps.setString(3, author.grtgener());
        ps.setString(3, author.getemail());
    

        int rows = 0;
        rows = ps.executeUpdate();

        ps.close();
        connection.close();

        return rows;
    
}
