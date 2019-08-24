package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.Livro;

@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletJSTL() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Livro> listaLivros = new ArrayList<>();
		
		Livro livro = new Livro();
		livro.setAutor("Nilton");
		livro.setDescricao("Livro feito por Nilton");
		livro.setTitulo("O livro do Nilton");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Nilton");
		livro2.setDescricao("Livro feito por Nilton");
		livro2.setTitulo("O livro2 do Nilton");
		
		Livro livro3 = new Livro();
		livro3.setAutor("Nilton");
		livro3.setDescricao("Livro feito por Nilton");
		livro3.setTitulo("O livro3 do Nilton");

		Livro livro4 = new Livro();
		livro4.setAutor("Nilton");
		livro4.setDescricao("Livro feito por Nilton");
		livro4.setTitulo("O livro4 do Nilton");
		
		Livro livro5 = new Livro();
		livro5.setAutor("Nilton");
		livro5.setDescricao("Livro feito por Nilton");
		livro5.setTitulo("O livro5 do Nilton");
		
		listaLivros.add(livro);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);
		
		request.setAttribute("listaLivrosNoAtributo", listaLivros);
		
		RequestDispatcher rd = getServletContext() .getRequestDispatcher("/listagemJstl.jsp");
		rd.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
