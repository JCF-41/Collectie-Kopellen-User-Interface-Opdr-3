/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Ramòn Janssen & Martijn van Buul
 */
public class Database {

    private static final Logger log = Logger.getLogger(Database.class.getName());
    
    private static final String url = "jdbc:oracle:thin:@192.168.2.14:1521/orcl";
    private static final String user = "MightyDuels";
    private static final String password = "MDPW";
    private static volatile Connection connection = null;

    /**
     * Opens connection
     */
    public static void openConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                log.severe("Failed to find server: " + url);
            }
            if (connection != null) {
                log.info("Succes.");
            } else {
                log.severe("Failed to make connection!");
            }
        } else {
            log.severe("Connection to " + url + " is already opened");
        }
    }

    /**
     * Closes connection
     */
    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            log.severe("Failed to close connection!");
        }
    }

    /**
     * Check if connection is opened
     *
     * @return returns true if database connection is open
     * @throws java.sql.SQLException
     */
    public static boolean checkConnection() throws SQLException {
        if (connection == null) {
            openConnection();
        } else if (connection.isClosed()) {
            openConnection();
        }

        return !connection.isClosed();
    }

    /**
     * Inserts a Record into a table
     *
     * @param statement The executable SQL statement (DML)
     * @throws SQLException
     */
    public static void DMLRecordIntoTable(String statement) throws SQLException {
        try (Statement DMLstatement = connection.createStatement()) {
            ResultSet executeQuery = DMLstatement.executeQuery(statement);
            executeQuery.close();
        } catch (SQLException e) {
            log.severe(e.getMessage());
        }
    }

    //resultset execute
    /**
     *
     * @param statement The executable SQL statement (Select)
     * @return
     * @throws SQLException
     */
    public static ArrayList<ArrayList> selectRecordFromTable(String statement) throws SQLException {
        Statement selectStatement = null;
        ArrayList<ArrayList> dataSet = new ArrayList<>();
        
        ResultSet resultSet = null;
        
        try {
            selectStatement = connection.createStatement();
            resultSet = selectStatement.executeQuery(statement);
            
            ResultSetMetaData data = resultSet.getMetaData();
            while (resultSet.next()) {
                ArrayList<String> columnData = new ArrayList<>();
                
                for(int i = 1; i <= data.getColumnCount(); i++){
                    columnData.add(resultSet.getString(i));
                }
                
                dataSet.add(columnData);
            }
            
        } catch (SQLException e) {
            log.severe(e.getMessage());
        } finally {
            if (selectStatement != null) {
                selectStatement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        }
        return dataSet;
    }
}
