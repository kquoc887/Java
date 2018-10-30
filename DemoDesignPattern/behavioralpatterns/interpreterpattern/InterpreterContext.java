package interpreterpattern;

public class InterpreterContext {
	public String getBinaryFormat(int i) {
		// chuyển thập phân sang nhị phân
		return Integer.toBinaryString(i);
	}
	
	//chuyển thập phân sang thập lục phân.
	public String  getHexadecimal(int i) {
		return Integer.toHexString(i);
	}
}
