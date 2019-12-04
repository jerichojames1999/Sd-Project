/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDelete;

import databaseanalyis.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author Villahermosa_sd2082
 */
public class DeleteConectionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalTime startedTime= LocalTime.now();
        System.out.println(startedTime);
        //With Connection to the Database
        try {
            // create a mysql database connection
            //String myDriver = "org.gjt.mm.mysql.Driver";
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/databaseanalysis";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // the mysql insert statement
            String query = " insert into databaseanalysis(COL1,COL2,COL3,COL4,COL5)"
                    + " values (?,?,?,?,?)";

            // create the mysql insert preparedstatement
            for (int i = 1; i <201; i++) {
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, i);
                preparedStmt.setInt(2, i + 1);
                preparedStmt.setInt(3, i + 2);
                preparedStmt.setInt(4, i + 3);
                preparedStmt.setInt(5, i + 4);
                //execute the preparedstatement
                preparedStmt.execute();
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        LocalTime endTime =LocalTime.now();
        System.out.println(endTime);
        
        //Without/Database
        LocalTime outstarted =LocalTime.now();
        System.out.println("\n"+outstarted);
        for(int x=0;x<1001;x++){
            System.out.println(x);
        }
        LocalTime outended =LocalTime.now();
        System.out.println(outended);
        
        }
    }
