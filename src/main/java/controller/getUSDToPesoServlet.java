package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.USDConverter;

/**
 * Servlet implementation class getUSDConversionServlet
 */
@WebServlet("/getUSDToPesoServlet")
public class getUSDToPesoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUSDToPesoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String amountUSD = request.getParameter("usdAmount");
		USDConverter userConversion = new USDConverter(Double.parseDouble(amountUSD));
		request.setAttribute("userConversion",userConversion);
		getServletContext().getRequestDispatcher("/pesoResult.jsp").forward(request, response);
	}
}
