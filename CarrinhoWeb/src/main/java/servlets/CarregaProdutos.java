package servlets;

import DAC.carrinho_interface.Carrinho;
import com.mycompany.carrinhoweb.CarrinhoDeCompras;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Anderson Souza
 */


@WebServlet (name = "init", urlPatterns = {"/loadProducts"})
public class CarregaProdutos extends HttpServlet {
    private Carrinho manager = new CarrinhoDeCompras();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String produto = req.getParameter("produto");
        manager.addItem(produto);
        
        HttpSession session = req.getSession();
        session.setAttribute("listaDeProdutos", manager.listarItens());
        
        
//        req.setAttribute("listaDeProdutos", manager.listarItens());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        
        
        
    }
    
    

}
