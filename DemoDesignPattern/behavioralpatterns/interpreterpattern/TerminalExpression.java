package interpreterpattern;

public class TerminalExpression implements Expression {
	private String data;
	public TerminalExpression(String data) {
		this.data = data;
	}
	@Override
	public String interpret(InterpreterContext context) {
		Expression exp = null;
		if (data.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(data.substring(0,data.indexOf(" "))));
		} else if (data.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(data.substring(0,data.indexOf(" "))));
		} else {
			return data;
		}
		return exp.interpret(context);
	}

}
