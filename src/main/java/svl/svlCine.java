package svl;

import java.io.IOException;

import bean.Cine;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class svlCine extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public svlCine() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        dao.CineDAO CineDAO = new dao.CineDAO();

        Object idCine = request.getParameter("idCine");
        if ( idCine == null) {
            String[][] cines = CineDAO.getVerCines();
            session.setAttribute("id", cines == null ? null : "cines");
            session.setAttribute("cines", cines );

            //List<Cine> lstCines = CineDAO.getVerCinesList();
            //session.setAttribute("id", lstCines == null ? null : "cines");
            //session.setAttribute("lstCines", lstCines );

        } else {
            //String[] aCine = CineDAO.getCine( idCine );
            //session.setAttribute("id", aCine == null ? null : "cine");
            //session.setAttribute("cine", aCine );
            //session.setAttribute("tarifas", CineDAO.getCineTarifas( idCine ) );
            //session.setAttribute("peliculas", CineDAO.getCinePeliculas( idCine ) );

            Cine cine = CineDAO.getCineList( idCine );
            session.setAttribute("id", cine == null ? null : "cine");
            session.setAttribute("cine", cine );
            session.setAttribute("lstCineTarifa", CineDAO.getCineTarifasList( idCine ) );
            session.setAttribute("lstCinePelicula", CineDAO.getCinePeliculasList( idCine ) );

        }

        response.sendRedirect("index.jsp");

        }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
