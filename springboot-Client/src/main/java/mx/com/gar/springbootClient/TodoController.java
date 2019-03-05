package mx.com.gar.springbootClient;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TodoController {
	@Autowired
	private Environment env;
	
	@RequestMapping("/Todo-list")
	public List<Todo>  getTodoList() {
		List<Todo> list = Arrays.asList(
				new Todo("Buy milk.", "Light.", "21/03/2019"),
				new Todo("Play Monster Hunter.", "Monstar Hunter World is OK.", "22/03/2019"),
				new Todo("Develop all day.", "All night.", "23/03/2019")
		);
		return list;
		
	}
	
}
