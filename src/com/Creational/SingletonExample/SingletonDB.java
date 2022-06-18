package com.Creational.SingletonExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDB {

    private static volatile SingletonDB instance=null;
    private static volatile Connection conn=null;

    private SingletonDB(){

        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        }catch(SQLException e){
            e.printStackTrace();
        }

        if(conn!=null){
            throw new RuntimeException("Use getConnection() method to create.");
        }

        if(instance!=null){
            throw new RuntimeException("Use getInstance() method to create.");
        }

    }

    public static SingletonDB getInstance(){
        if(instance==null){
            synchronized (SingletonDB.class){
                if(instance==null){
                    instance=new SingletonDB();
                }
            }
        }

        return instance;
    }

    public Connection getDBConnection(){
        if(conn==null){
            synchronized (SingletonDB.class){
                if(conn==null){
                    try{
                        String dbURL="jdbc:derby:memory:codejava/webdb;create=true";
                        conn= (Connection) DriverManager.getConnection(dbURL);
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }

}
