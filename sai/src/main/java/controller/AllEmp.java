package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

import pojo.AllEmployyPojo;

/**
 * Servlet implementation class AllEmp
 */
public class AllEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Gson gson = new Gson();
	dao.AllEmpData AllEmpData;
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public AllEmp() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		AllEmployyPojo json=gson.fromJson(request.getReader(), AllEmployyPojo.class);
		int id=Integer.parseInt(request.getParameter("id1"));
		PrintWriter out = response.getWriter();
		out.print(id);

//		try {
//		if(id>=0) {
//			AllEmployyPojo e;			
//					e = AllEmpData.getEmployee(id);
//			
//			
//			
//			String JsonString = gson.toJson(e);
//			
//			PrintWriter out = response.getWriter();
//			response.setContentType("application/JSON");
////			response.setCharacterEncoding("UTF-8");
//			out.print(JsonString);
//			out.flush();
//		}
//		else {
//			List<Object> e = AllEmpData.getall();
//			String employeeJsonString = gson.toJson(e);
//			PrintWriter out = response.getWriter();
//			response.setContentType("application/json");
//			response.setCharacterEncoding("UTF-8");
//			out.print(employeeJsonString);
//			out.flush();	
//		}
//		} catch (SQLException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
