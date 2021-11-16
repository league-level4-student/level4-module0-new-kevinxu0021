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

		DataType[] dataTypes = DataType.values();
		;
		int result = JOptionPane.showOptionDialog(null, "Pick a data type to learn about!", "Data Types",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dataTypes, null);
		DataType dataType = DataType.Byte;

		if (result == 0) {
			dataType = DataType.Byte;
		} else if (result == 1) {
			dataType = DataType.Short;
		} else if (result == 2) {
			dataType = DataType.Int;
		} else if (result == 3) {
			dataType = DataType.Long;
		} else if (result == 4) {
			dataType = DataType.Float;
		} else if (result == 5) {
			dataType = DataType.Double;
		} else if (result == 6) {
			dataType = DataType.Boolean;
		} else {
			dataType = DataType.Char;
		}

		switch (dataType) {
		case Byte: {
			JOptionPane.showMessageDialog(null,
					"Bytes can only contain integers, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Short: {
			JOptionPane.showMessageDialog(null,
					"Shorts can only contain integers, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Int: {
			JOptionPane.showMessageDialog(null,
					"Integers can only contain integers, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Long: {
			JOptionPane.showMessageDialog(null,
					"Longs can only contain integers, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Float: {
			JOptionPane.showMessageDialog(null,
					"Floats can only contain floating point numbers, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Double: {
			JOptionPane.showMessageDialog(null,
					"Doubles can only contain floating point numbers, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Boolean: {
			JOptionPane.showMessageDialog(null,
					"Booleans can only contain true or false, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		case Char: {
			JOptionPane.showMessageDialog(null,
					"Chars can only contain Unicode characters, it is made up of " + dataType.get() + " bits. ");
			break;
		}
		}
	}
}
