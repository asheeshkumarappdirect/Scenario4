/**
 * Program to create/insert/update/delete/select student table in the db. Student table will have the following fields:
  Student ID
  Name
  Class
  Marks

  Program to perform Batch processing and Transaction management for Student table.

 * Created by asheeshkumar on 2/19/17.
 */

import java.sql.*;

public class Student
{
    public static void main(String[] args) throws ClassNotFoundException, Exception
    {
        //Loading the JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("JDBC driver loaded.");

        //Creating Connection with Database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student" , "root","password");
        System.out.println("Connection established with Database");

        /*
            //Creating the Student Table
        Statement st = con.createStatement();
        st.execute("create table Student (S_Id int(3) primary key, Name varchar(20), Class int(2), Marks int(3))");
        System.out.println("Student table created");
        */

        /*
            //Inserting values in Student Table
        Statement st = con.createStatement();
        st.executeUpdate("insert into Student values('1','Asheesh','12', '83')");
        st.executeUpdate("insert into Student values('2','Priyanshu','12', '85')");
        st.executeUpdate("insert into Student values('3','Jasdeep','12', '88')");
        System.out.println("Values inserted in Student Table");
        */

        /*
            //Updating a record in Student Table
        Statement st = con.createStatement();
        st.executeUpdate("update Student set Name='Asheesh K' where name='Asheesh'");
        System.out.println("Record updated in Student Table");
        */

        /*
            //Deleting a record in Student Table
        Statement st = con.createStatement();
        st.executeUpdate("delete from Student");
        System.out.println("Deleted records from Student Table");
        */

        /*
            //Selecting records from Student Table
        Statement st = con.createStatement();
        ResultSet rst = st.executeQuery("Select * from Student");
        System.out.println("S_Id  Name       Class  Marks");
        System.out.println("-----------------------------");
        while(rst.next())
        {
            try
            {
                System.out.print(rst.getString(1));
                System.out.print("     " + rst.getString(2));
                System.out.print("  " + rst.getString(3));
                System.out.println("     " + rst.getString(4));
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        */

        //Inserting values in Student table usign Batch processing
        //Transaction management
        Statement st = con.createStatement();
        con.setAutoCommit(false);
        st.addBatch("insert into Student values ('1', 'Asheesh', '12', '83')");
        st.addBatch("insert into Student values ('2', 'Priyanshu', '12', '85')");
        st.addBatch("insert into Student values ('3', 'Jasdeep', '12', '88')");
        try
        {
            st.executeBatch();
            con.commit();
        }
        catch (Exception e)
        {
            try
            {
                con.rollback();
                e.printStackTrace();
            }
            catch (Exception e1) {
                System.out.println(e1);
            }
        }
        System.out.println("Batch Processing and Transaction management implemented");

        //Closing the connection
        con.close();
        System.out.println("Connection Closed");
    }

}
