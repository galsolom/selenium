package Lesson3a;

import java.util.List;

public interface IDbservice {
	
	public void openConnection(String connString);
	
	public List<String[]> getResults(String sql);

}
