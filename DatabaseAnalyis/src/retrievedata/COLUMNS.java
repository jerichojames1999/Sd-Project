/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrievedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Villahermosa_sd2082
 */
public class COLUMNS {

    public ArrayList<Integer> COL1 = new ArrayList<Integer>();
    public ArrayList<Integer> COL2 = new ArrayList<Integer>();
    public ArrayList<Integer> COL3 = new ArrayList<Integer>();
    public ArrayList<Integer> COL4 = new ArrayList<Integer>();
    public ArrayList<Integer> COL5 = new ArrayList<Integer>();
    public int average1 = 0;
    public int average2 = 0;
    public int average3 = 0;
    public int average4 = 0;
    public int average5 = 0;

    public COLUMNS() {
//         LocalTime startedTime= LocalTime.now();
//        System.out.println(startedTime);
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/databaseanalysis";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM databaseanalysis";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                int col1 = rs.getInt("COL1");
                int col2 = rs.getInt("COL2");
                int col3 = rs.getInt("COL3");
                int col4 = rs.getInt("COL4");
                int col5 = rs.getInt("COL5");
                COL1.add(col1);
                COL2.add(col2);
                COL3.add(col3);
                COL4.add(col4);
                COL5.add(col5);

            }

            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
//        LocalTime endTime =LocalTime.now();
//        System.out.println(endTime);
    }

    public ArrayList<Integer> getCOL1() {
        System.out.println(COL1);
        return COL1;
    }

    public void setCOL1(ArrayList<Integer> COL1) {
        this.COL1 = COL1;
    }

    public ArrayList<Integer> getCOL2() {
        return COL2;
    }

    public void setCOL2(ArrayList<Integer> COL2) {
        this.COL2 = COL2;
    }

    public ArrayList<Integer> getCOL3() {
        return COL3;
    }

    public void setCOL3(ArrayList<Integer> COL3) {
        this.COL3 = COL3;
    }

    public ArrayList<Integer> getCOL4() {
        return COL4;
    }

    public void setCOL4(ArrayList<Integer> COL4) {
        this.COL4 = COL4;
    }

    public ArrayList<Integer> getCOL5() {
        return COL5;
    }

    public void setCOL5(ArrayList<Integer> COL5) {
        this.COL5 = COL5;
    }

    public int getAverage1() {
        System.out.println("Column1Average:" + average1 / 200+"\n");
        return average1;
    }

    public void setAverage1(int average1) {
        this.average1 = average1;
    }

    public int getAverage2() {
        System.out.println("Column2Average:" + average2 / 200+"\n");
        return average2;
    }

    public void setAverage2(int average2) {
        this.average2 = average2;
    }

    public int getAverage3() {
         System.out.println("Column3Average:" + average3 / 200+"\n");
        return average3;
    }

    public void setAverage3(int average3) {
        this.average3 = average3;
    }

    public int getAverage4() {
         System.out.println("Column4Average:" + average4/200+"\n");
        return average4;
    }

    public void setAverage4(int average4) {
        this.average4 = average4;
    }

    public int getAverage5() {
         System.out.println("Column5Average:" + average5/200+"\n");
        return average5;
    }

    public void setAverage5(int average5) {
        this.average5 = average5;
    }

    public void COLUMN1() {
        LocalTime startedTime1 = LocalTime.now();
        System.out.println(startedTime1);
        for (Integer i : COL1) {
            average1 += i;
        }
        LocalTime endTime1 = LocalTime.now();
        System.out.println(endTime1);
    }

    public void COLUMN2() {
        LocalTime startedTime2 = LocalTime.now();
        System.out.println(startedTime2);
        for (Integer i : COL2) {
            average2 += i;
        }
        LocalTime endTime2 = LocalTime.now();
        System.out.println(endTime2);
    }

    public void COLUMN3() {
        LocalTime startedTime3 = LocalTime.now();
        System.out.println(startedTime3);
        for (Integer i : COL3) {
            average3 += i;
        }
        LocalTime endTime3 = LocalTime.now();
        System.out.println(endTime3);
    }

    public void COLUMN4() {
        LocalTime startedTime4 = LocalTime.now();
        System.out.println(startedTime4);
        for (Integer i : COL4) {
            average4 += i;
        }
        LocalTime endTime4 = LocalTime.now();
        System.out.println(endTime4);
    }
    public void COLUMN5() {
        LocalTime startedTime5 = LocalTime.now();
        System.out.println(startedTime5);
        for (Integer i : COL5) {
            average5 += i;
        }
        LocalTime endTime5 = LocalTime.now();
        System.out.println(endTime5);
    }
}
