package com.javedhalani.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbType) {
            case MYSQL:
                con = MySqlHelper.getMySqlDbConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHtmlReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPdfReport(tableName, con);
                        break;
                }
            case ORACLE:
                con = OracleHelper.getOracleDbConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHtmlReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePdfReport(tableName, con);
                        break;
                }

        }
    }

    public enum DBTypes{
        MYSQL,ORACLE
    }

    public enum ReportTypes{
        HTML,PDF
    }
}
