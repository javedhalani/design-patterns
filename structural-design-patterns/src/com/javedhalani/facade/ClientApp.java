package com.javedhalani.facade;

import java.sql.Connection;

import com.javedhalani.facade.HelperFacade;

public class ClientApp {

    public static void main(String[] args) {
        String tableName = "Employee";

        // Generating MySQL HTML report and Oracle PDF report without Facade
        Connection con = MySqlHelper.getMySqlDbConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHtmlReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDbConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePdfReport(tableName, con1);

        // Generating using facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
