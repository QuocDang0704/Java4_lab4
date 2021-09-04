

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Item> items = Arrays.asList(new Item[] {
				new Item("Nokia 2020", "nokia.png", 500, 0.1),
				new Item("Samsung Xyz", "samsung.png", 700, 0.15),
				new Item("iPhone Xy", "iphone.png", 900, 0.25),
				new Item("Sony Erricson", "sony.png", 55, 0.3),
				new Item("Seamen", "seamen.png", 70, 0.5),
				new Item("Oppo 2021", "oppo.png", 200, 0.2)
				});
				request.setAttribute("items", items);
		request.getRequestDispatcher("/views/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
