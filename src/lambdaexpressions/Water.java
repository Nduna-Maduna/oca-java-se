package lambdaexpressions;

public class Water {
	private String source;
	
	public Water(String source) {
		super();
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public String toString() {
		return this.source;
	}
}
