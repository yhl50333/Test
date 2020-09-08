package com.cod.dem.code;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import java.sql.SQLException;

@SpringBootTest
public class Comc {
    @Autowired
    private DataSource dataSource;
    @Test
   public void cod(){
       try {
           System.out.println(dataSource.getConnection());
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }
   }

}
