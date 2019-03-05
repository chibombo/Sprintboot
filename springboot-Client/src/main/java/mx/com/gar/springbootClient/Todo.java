package mx.com.gar.springbootClient;

public class Todo {
	private String Title;
	private String Description;
	private String Date;
	
	public Todo(String Title, String Description, String Date) {
		this.Title = Title;
		this.Description = Description;
		this.Date = Date;		
	}
	public String getTitle() {
		return this.Title;
	}
	public String getDescription() {
		return this.Description;
	}
	public String getDate() {
		return this.Date;
	}
}
