
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user.php")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<User> users = Arrays.asList(new User[] { 
				new User("Username 1", "Password 1", true),
				new User("Username 2", "Password 2", false), 
				new User("Username 3", "Password 3", true) });
		request.setAttribute("message", "Quản lý người sử dụng!");
		request.setAttribute("form", users.get(0));
		request.setAttribute("items", users);

		request.getRequestDispatcher("/views/user/index.jsp").forward(request, response);
		;
	}

}
