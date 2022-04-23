package data;

public class ReadWriteExcelFiles {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("C:\\Testing\\NikulTest.xlsx");
		
		//1  read
		
		//2
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		// write
		d.setCellData("Data1", "Name", 11, "testing11");
		System.out.println(d.getCellData("Data1", "Name", 11));
		
		//d.addColumn("Data1","Nikul");
		d.setCellData("Data1", "Nikul", 4, "Farah");
		d.setCellData("Data1", "Global Error", 4, "khan");
		
	}

}
