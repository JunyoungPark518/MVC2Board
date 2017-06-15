package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Article;
import handler.PageHandler;
import service.Service;
import serviceImpl.ServiceImpl;
import util.DispatcherServlet;
import util.Separator;

@WebServlet("/board.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Service service = ServiceImpl.getInstance();
		Article a = new Article();
		List<Article> list = new ArrayList<>();
		Map<String, String> params = new HashMap<>();
		PageHandler handler = new PageHandler();
		System.out.println(Separator.command.getAction());
		switch (Separator.command.getAction()) {
		case "move":
			break;
		case "list":
			params.put("pageNo", request.getParameter("pageNo"));
			try {	params.put("count", String.valueOf(service.count()));} catch (Exception e) {}
			handler.process(params);
			int[] pageArr = {handler.getAttr()[3], handler.getAttr()[4]};
			try {list = service.findAll();} catch (Exception e) {	}
			String[] arr = {"count", "pageCount", "pageNo", "pageStart", "pageEnd", "blockStart", "blockEnd", "prevBlock", "nextBlock"};
			for(int i=0; i<9; i++) {
				request.setAttribute(arr[i], handler.getAttr()[i]);
			}
			request.setAttribute("list", list);
			break;
		case "detail":
			a.setSeq(request.getParameter("seq"));
			try {
				a = service.findOne(a);
			} catch (Exception e) {}
			request.setAttribute("article", a);
			break;
		default:
			break;
		}	
		DispatcherServlet.send(request, response);
	}

}
