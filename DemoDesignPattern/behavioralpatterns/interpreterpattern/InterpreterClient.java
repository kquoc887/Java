package interpreterpattern;

public class InterpreterClient {
	public InterpreterContext context;
	
	public InterpreterClient(InterpreterContext context) {
		this.context = context;
	}
	
	public String interpret(String str) {
		Expression exp = null;
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		} else {
			return str;
		}
		return exp.interpret(context);
	}
	
	public static void main(String[] args) {
		String str1 = "12 in Hexadecimal";
		String str2 = "100 in Binary";
		InterpreterClient client = new InterpreterClient(new InterpreterContext());
		System.out.println(str1 + " = " + client.interpret(str1));
		System.out.println(str2 + " = " + client.interpret(str2));
	}

}
