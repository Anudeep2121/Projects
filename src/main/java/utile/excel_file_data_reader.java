package utile;

import java.util.HashMap;
import java.util.List;

public class excel_file_data_reader {
	private static String Testdatapath = "E:\\Cucumber_POM_Masscor_ERP\\cucumber_pom_masscor_erp\\src\\main\\resources\\TestData\\";

	public static List<HashMap<String, String>> getPOInvData() {
		return Excel_Reader.readExcelDatafromFile(Testdatapath + "MasscorTestData.xlsx", "PO_Inv");
	}

}
