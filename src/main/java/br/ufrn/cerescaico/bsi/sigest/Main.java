/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.cerescaico.bsi.sigest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author taciano
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Evento evento = new Evento();
		 * 
		 * evento.setNome("Jats 2012");
		 * evento.setDescricao("Jornada de Atualização Tecnológica");
		 * 
		 * EventoBO eventoMB = new EventoBO(); eventoMB.inserir(evento);
		 * 
		 * System.out.println(System.getProperty("user.dir"));
		 * 
		 * List<Evento> eventos = eventoMB.listar();
		 * 
		 * for (Evento ev : eventos) { System.out.println(ev); }
		 * 
		 * long start = System.currentTimeMillis(); //Preparing parameters Map
		 * parameters = new HashMap(); //parameters.put("ReportTitle",
		 * "Address Report"); //parameters.put("DataFile",
		 * "CustomBeanFactory.java - Bean Array");
		 * 
		 * JRBeanCollectionDataSource data = new
		 * JRBeanCollectionDataSource(eventos);
		 * 
		 * System.err.println("Filling time : " + (System.currentTimeMillis() -
		 * start));
		 * 
		 * String jasperFile = System.getProperty("user.dir")+
		 * "/src/main/webapp/reports/listaEventos.jrxml";
		 * 
		 * JasperPrint jasperPrint; try { JasperReport jasperReport =
		 * JasperCompileManager.compileReport(jasperFile); jasperPrint =
		 * JasperFillManager.fillReport(jasperReport, parameters, data);
		 * //executa o relatório JasperViewer.viewReport(jasperPrint); } catch
		 * (JRException ex) {
		 * Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); }
		 */

		/*
		 * Preenche o relatório com os dados. Gera o arquivo
		 * BibliotecaPessoal.jrprint
		 */
		// JasperFillManager.fillReportToFile( jasperFile, parametros, jrRS );

		/*
		 * Exporta para o formato PDF
		 */
		// JasperExportManager.exportReportToPdfFile(
		// "untitled_report_1.jrprint" );
	}
}
