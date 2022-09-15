package och01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		/* doGet(request, response); */
		
		Date date = new Date();
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>게시판</h1>");
		out.printf("제목:  %s <br>", title);
		out.printf("작성자: %s <br>", writer);
		out.printf("작성일: %s <br>", date);
		out.printf("내용: <pre> %s<pre>", content);
		out.print("</body></html>");
		out.close();
	}

}
	/* 강사님답안
	 * PrintWriter out = response.getWriter();
	 * out.print("<html><body><h1>게시판</h1>"); 
	 * out.printf("제목 : " + title + "<p>");
	 * out.printf("작성자 : " + writer + "<p>"); 
	 * out.printf("작성일 : " + date + "<p>");
	 * out.printf("내용 <br><pre>" + content + "</pre>" ); 
	 * out.print("</body></html>");
	 * out.close();
	 */
