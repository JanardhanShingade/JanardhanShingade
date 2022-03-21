

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String url= "jdbc:mysql://localhost:3306/ecommerce";
 		String userid= "root";
 		String password= "Simplilearn";
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            DBConnection conn = new DBConnection(url,userid,password);
            CallableStatement stmt = conn.getConnection().prepareCall("{call add_product(?, ?)}");
           
           
           //DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
           //CallableStatement stmt = conn.getConnection().prepareCall("{call add_product(?, ?)}");
           stmt.setString(1, "Mac");
           stmt.setBigDecimal(2, new BigDecimal(21900.50));
           stmt.executeUpdate();
           
           out.println("Stored procedure has been executed.<Br>");
           stmt.close();
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
   }
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   // TODO Auto-generated method stub
   doGet(request, response);
}
}

