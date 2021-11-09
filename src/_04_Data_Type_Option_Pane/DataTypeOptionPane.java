package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

enum DataType {
	Byte(8), Short(16), Int(32), Long(64), Float(32), Double(64), Boolean(1), Char(16);

	private final int bits;

	private DataType(int bits) {
		this.bits = bits;
	}

	public int get() {
		return this.bits;
	}
}

public class DataTypeOptionPane {
	public static void main(String[] args) {

		DataType[] dataTypes = DataType.values();;
		JOptionPane.showOptionDialog(null, "Pick a data type to learn about!", "Data Types", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dataTypes, null);
	}
}
