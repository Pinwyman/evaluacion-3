package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DaoLogin;


public class controladora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public controladora() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
        String usuario, password;
        String mensaje="";
        usuario = request.getParameter("user");
        password = request.getParameter("pass");

        if (usuario != null && password != null) {
            try {
                if (DaoLogin.validar(usuario, password) > 0) {
                	mensaje = "Usuario y Clave Correcta";
                } else {
                	mensaje = "Usuario y Clave Incorrecta Revisar";
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
        	mensaje = "Usuario y/o Clave son nulos";
        }


}
	}
