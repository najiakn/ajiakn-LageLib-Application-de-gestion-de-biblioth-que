package WEB;

import java.io.IOException;
import java.util.List;

import DAO.Ilivre;
import DAO.implementLivre;
import Metier.livre;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ControleurServlet  extends HttpServlet{
	
	private Ilivre metier;
	 
	@Override
	
	public void init() throws ServletException{
		metier=new implementLivre();
		
	}
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response)throws
	ServletException ,IOException{
		String path =request.getServletPath();
		if(path.equals("/index.do")) {
		request.getRequestDispatcher("livre.jsr").forward(request, response);
		}

		else if(path.equals("/rechercher.do")) {
			String mc=request.getParameter("mc");
			livreModel model = new livreModel();
			model.setMc(mc);
			List<livre> livres=metier.chercher("%"+mc+"%");
			model.setLivres(livres);
			request.setAttribute("model", model);
			request.getRequestDispatcher("livre.jsp").forward(request, response);
		}
		request.getRequestDispatcher("livre.jsp").forward(request, response);
	}

}
