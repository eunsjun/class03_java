package day14;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MainController {
	String execute(HttpServletRequest req, HttpServletResponse resp);
}
