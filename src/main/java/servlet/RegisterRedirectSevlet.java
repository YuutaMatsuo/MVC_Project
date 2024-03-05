package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerRedirect")
public class RegisterRedirectSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ①リダイレクトする
		// ※リダイレクトの場合はWEB-INFフォルダへ隠すことが出来なくなる。
//		response.sendRedirect("/WEB-INF/jsp/registerRedirect.jsp");
		
		// WEB-INFフォルダからwebapp直下へjspファイルを移動させることでリダイレクトが出来る
		response.sendRedirect("/MVC_Project/registerRedirect.jsp");
	}

}
