 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import supermarket.layerd.db.DBConnection;
import java.sql.ResultSet;

/**
 *
 * @author Vihanga
 */
public class CrudUtil {
    public static PreparedStatement getPreparedStattement(String sql,Object... args) throws SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        if(args != null){
            for(int i = 0; i < args.length;i++){
                preparedStatement.setObject(i+1, args[i]);
            }
        }
        return preparedStatement;
    }
    
    public static boolean executeUpdate(String sql,Object... args) throws SQLException{
        return getPreparedStattement(sql, args).executeUpdate() > 0;
    }
    
    public static ResultSet executeQuery(String sql,Object... args) throws SQLException{
        return getPreparedStattement(sql, args).executeQuery();
    }
}
