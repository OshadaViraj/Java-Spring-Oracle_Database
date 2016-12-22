/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testspring.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author Oshada
 */
@Controller
@RequestMapping(value = "/Report")
public class ReportController {

  @RequestMapping(value = "add", method = GET)
  public String hotelReport(HttpServletResponse response) throws JRException, IOException, Exception
  {
      
        List bugDetails = new ArrayList();
       Map reportData = new HashMap();
        reportData.put("Title", "Ho");
        JasperReport jr = JasperCompileManager.compileReport("D:\\TestSpring\\src\\main\\java\\com\\testspring\\report\\Test.jrxml");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jr, reportData, new JRMapCollectionDataSource(bugDetails));
        response.setContentType("application/pdf");
        response.setHeader("Content-disposition", "inline; filename=BugReport.pdf");
        OutputStream outStream = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
   return "releaseReport";
  }
    
}



