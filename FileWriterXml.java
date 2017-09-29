import java.io.*;

public class FileWriterXml {
	public static void main(String [] args) throws IOException {
		String source = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>n\" +\n" + 
				"<cfdi:Comprobante xmlns:cfdi=\"http://www.sat.gob.mx/cfd/3\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.sat.gob.mx/cfd/3 http://www.sat.gob.mx/sitio_internet/cfd/3/cfdv32.xsd http://www.sat.gob.mx/nomina12 http://www.sat.gob.mx/sitio_internet/cfd/nomina/nomina12.xsd\" version=\"3.3\" serie=\"nomina 20170910\" folio=\"5410\" fecha=\"2017-09-05T16:04:06\" sello=\"\" formaDePago=\"99\" noCertificado=\"00001000000301254517\" certificado=\"\" condicionesdePago=\"\" subTotal=\"7736.75\" descuento=\"2199.02\" Moneda=\"MXN\" total=\"5537.73\" tipoDeComprobante=\"N\" xmlns:nomina12=\"http://www.sat.gob.mx/nomina12\" metodoDePago=\"PUE\" LugarExpedicion=\"21100\" confirmacion=\"\">\n" + 
				"<cfdi:Emisor rfc=\"UAE5702287S5\" nombre=\"UNIVERSIDAD AUTONOMA DEL ESTADO DE BAJA CALIFORNIA\">\n" +
				"<cfdi:RegimenFiscal Regimen=\"603\"/>\n" +
				"</cfdi:Emisor>\n" + 
				"<cfdi:Receptor rfc=\"CAEL850102LQ8\" nombre=\"CHAVEZ ESCUDERO LUIS EDUARDO\" usoCFDI=\"P01\">\n" + 
				"</cfdi:Receptor>\n" +
				"<cfdi:Conceptos>\n" + 
				"<cfdi:Concepto ClaveProdServ=\"84111505\" cantidad=\"1\" claveUnidad=\"ACT\" descripcion=\"Pago de nómina\" valorUnitario=\"7736.75\" importe=\"7736.75\" descuento=\"\"/>\n" + 
				"</cfdi:Conceptos>\n" +
				"<cfdi:Impuestos/>\n" + 
				"<cfdi:Complemento>\n" + 
				"<nomina12:Nomina xmlns:nomina12=\"http://www.sat.gob.mx/nomina12\" FechaFinalPago=\"2017-09-10\" FechaInicialPago=\"2017-08-28\" FechaPago=\"2017-09-08\" NumDiasPagados=\"13\" TotalPercepciones=\"7736.75\" TotalDeducciones=\"2199.02\" Version=\"1.2\" TipoNomina=\"E\">\n" + 
				"<nomina12:Emisor RegistroPatronal=\"A0610517102\">\n" +
				"<nomina12:EntidadSNCF OrigenRecurso=\"IP\">\n" + 
				"</nomina12:EntidadSNCF>\n" + 
				"</nomina12:Emisor>\n" + 
				"<nomina12:Receptor SalarioDiarioIntegrado=\"673.26\" TipoRegimen=\"02\" Curp=\"CAEL850102HSRHSS04\" NumEmpleado=\"28917\" RiesgoPuesto=\"1\" NumSeguridadSocial=\"24038534285\" TipoJornada=\"01\" TipoContrato=\"03\" FechaInicioRelLaboral=\"2017-08-29\" Puesto=\"ANALISTA TECNICO N  M\" Departamento=\"CONTADURIA\" PeriodicidadPago=\"99\" ClaveEntFed=\"BCN\" Antigüedad=\"P1W\" Sindicalizado=\"\" SalarioBaseCotApor=\"\">\n" + 
				"</nomina12:Receptor>\n" +
				"<nomina12:Percepciones TotalExento=\"935.00\" TotalGravado=\"6801.75\" TotalSeparacionIndemnizacion=\"\" TotalSueldos=\"7736.75\">\n" + 
				"<nomina12:Percepcion ImporteExento=\"111.61\" ImporteGravado=\"0.00\" Concepto=\"APORTACION UABC FONDO DE AHORRO\" Clave=\"7601\" TipoPercepcion=\"005\"/>\n" + 
				"<nomina12:Percepcion ImporteExento=\"0.00\" ImporteGravado=\"6801.75\" Concepto=\"SUELDO ORDINARIO CATORCENAL 80\" Clave=\"8000\" TipoPercepcion=\"001\"/>\n" +
				"<nomina12:Percepcion ImporteExento=\"823.39\" ImporteGravado=\"0.00\" Concepto=\"AYUDA PARA DESPENSA FAMILIAR\" Clave=\"9901\" TipoPercepcion=\"029\"/>\n" + 
				"</nomina12:Percepciones>\n" +
				"<nomina12:SeparacionIndemnizacion TotalPagado=\"\" NumAñosServicio=\"\" UltimoSueldoMensOrd=\"\" IngresoAcumulable=\"\" IngresoNoAcumulable=\"\"></nomina12:SeparacionIndemnizacion>\n" + 
				"<nomina12:Deducciones TotalOtrasDeducciones=\"998.00\" TotalImpuestosRetenidos=\"1201.02\">\n" +
				"<nomina12:Deduccion Importe=\"1201.02\" Concepto=\"I S P T                     01\" Clave=\"0100\" TipoDeduccion=\"002\"/>\n" + 
				"<nomina12:Deduccion Importe=\"230.64\" Concepto=\"I M S S                     02\" Clave=\"0200\" TipoDeduccion=\"001\"/>\n" + 
				"<nomina12:Deduccion Importe=\"544.14\" Concepto=\"FONDO DE PENSION PERS ADMVO  06\" Clave=\"0601\" TipoDeduccion=\"003\"/>\n" + 
				"<nomina12:Deduccion Importe=\"111.61\" Concepto=\"RETEN  A EMPLEADO FONDO AHORRO  07\" Clave=\"0701\" TipoDeduccion=\"004\"/>\n" + 
				"<nomina12:Deduccion Importe=\"111.61\" Concepto=\"APORTACION UABC FONDO DE AHORRO\" Clave=\"0702\" TipoDeduccion=\"004\"/>\n" + 
				"</nomina12:Deducciones>\n" +
				"</nomina12:Nomina>\n" + 
				"</cfdi:Complemento>\n" + 
				"</cfdi:Comprobante>\n";
		
		char buffer [] = new char[source.length()];
		source.getChars(0, source.length(), buffer, 0);
		
		try (FileWriter f0 = new FileWriter("archivo.xml")) {
			
			//write the xml file
			f0.write(buffer);
		} catch(IOException e) {
			System.out.println("An I/O Error Ocurred");
		}
	}
}
