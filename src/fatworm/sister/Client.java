package fatworm.sister;

public interface Client {

	public void connect(String url);

	public void setOutput(String outputFile);

	public void appendLine(String line);

	public void disconnect();

}
