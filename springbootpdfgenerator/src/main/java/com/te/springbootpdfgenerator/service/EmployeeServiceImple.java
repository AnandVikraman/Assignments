package com.te.springbootpdfgenerator.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.te.springbootpdfgenerator.bean.Employee;
import com.te.springbootpdfgenerator.repository.EmployeeDAO;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class EmployeeServiceImple implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return dao.save(employee);
	}

	@Override
	public void export(HttpServletResponse response) throws DocumentException, IOException {
		Document document = new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		
		document.open();
		
		PdfPTable table = new PdfPTable(4);
		PdfPCell cell = new PdfPCell(new Phrase("empId"));
		table.addCell(cell);
		
		cell= new PdfPCell(new Phrase("empName"));
		table.addCell(cell);
		
		cell= new PdfPCell(new Phrase("deparment"));
		table.addCell(cell);
		
		cell= new PdfPCell(new Phrase("doj"));
		table.addCell(cell);
		
		table.setHeaderRows(1);
		
		dao.findAll().stream().forEach(employee -> {
			table.addCell(employee.getEmpId().toString());
			table.addCell(employee.getEmpName());
			table.addCell(employee.getDeparment());
			table.addCell(employee.getDoj().toString());
		});
		document.add(table);
		document.close();
		
	}

}
