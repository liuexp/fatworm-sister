package fatworm.sister.sqlcli;

import java.util.Properties;

public interface SqlClient {

	public void appendLine(String line);
	
	public void connect(String url, Properties info);
}
