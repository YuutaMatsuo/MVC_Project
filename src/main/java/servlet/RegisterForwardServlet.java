package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerForward")
public class RegisterForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ①フォワードを行う準備として「RequestDispatcher」インスタンスを生成する
		// ※どこへ転送するのか指定する
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/registerForward.jsp");
		// ②ここから実際に転送する
		dispatcher.forward(request, response);
	}
}
