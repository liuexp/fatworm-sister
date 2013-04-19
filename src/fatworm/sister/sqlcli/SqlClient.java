package fatworm.sister.sqlcli;

public interface SqlClient {

	public void appendLine(String line);
	
	public void connect(String url);

	public void setOutput(String outputFile);
}
