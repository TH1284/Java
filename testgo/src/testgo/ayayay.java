package testgo;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ayayay {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@192.168.110.112:1521:orcl";
        String sql = "select * from leewon";
        Connection conn = null;
        java.sql.Statement st = null; //DB와 소통하는 통로

        ResultSet rs = null; //결과 받아서 처리할때
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver load 성공!");
            conn = DriverManager.getConnection(url, "kopo", "kopo");
            System.out.println("DB 연결 성공!");

            st = conn.createStatement();
            rs = st.executeQuery(sql); //쿼리 실행 후 데이터들이 rs 저장
            while(rs.next()){ //한건씩 처리
                int empid = rs.getInt("IDX"); //첫번째 칼럼 조회
                String fname = rs.getString("REGIONSEG1"); //컬럼이름도 지정 가능
                String sal = rs.getString("PRODUCTSEG2"); //컬럼이름도 지정 가능
                String sal1 = rs.getString("PRODUCTSEG12");
//                String sal2 = rs.getString("PRODUCTSEG2");
//                int sal = rs.getInt("salary");
//                Date hireDate =  rs.getDate("hire_date");
//                System.out.println(empid+ "\t" + fname + "\t" + sal + "\t" + hireDate);
                System.out.println(empid + "\t" + fname + "\t" + sal + "\t" + sal1);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("driver load 실패!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 연결 실패!");
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(st != null) st.close();
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }   
    }
}
