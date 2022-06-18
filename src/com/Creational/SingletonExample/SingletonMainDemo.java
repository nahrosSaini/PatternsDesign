package com.Creational.SingletonExample;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonMainDemo {

    public static void main(String arg[]){

        SingletonDB instance=SingletonDB.getInstance();

        long timeBefore=0;
        long timeAfter=0;
        System.out.println(instance);

        timeBefore=System.currentTimeMillis();
        Connection connection=instance.getDBConnection();
        timeAfter=System.currentTimeMillis();

        System.out.println(timeAfter-timeBefore);

        Statement statement;

        try{

            statement=connection.createStatement();
            int count=statement.executeUpdate("CREATE TABLE ADDRESS(ID INT,StreetName VARCHAR(20),"+"City VARCHAR(20))");
            System.out.println("Table Created..!!");
            statement.close();

        }catch(SQLException e){
            e.printStackTrace();
        }

        timeBefore=System.currentTimeMillis();
        connection=instance.getDBConnection();
        timeAfter=System.currentTimeMillis();

        System.out.println(timeAfter-timeBefore);


    }

}
