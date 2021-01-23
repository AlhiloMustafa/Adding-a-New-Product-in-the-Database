package com.hcl.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.web.dao.ProductDAO;
import com.hcl.web.model.Product;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int pid = Integer.parseInt(request.getParameter("pid"));

		ProductDAO pDAO = new ProductDAO();
		Product prd = pDAO.getProduct(pid);

		RequestDispatcher reqDis = request.getRequestDispatcher("showProducts.jsp");

		request.setAttribute("product", prd);

		reqDis.forward(request, response);

	}

}
