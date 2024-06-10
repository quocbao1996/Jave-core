package com.vti.fronend;

import com.mysql.cj.jdbc.JdbcConnection;

public class UserProgram {
    public static void main (String[] args){
        JdbcUtil.checkConnection();
    }
}