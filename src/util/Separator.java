package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Command;
import factory.CommandFactory;

public class Separator {
	public static Command command;
	public static void init(HttpServletRequest request, HttpServletResponse response) { 
		String path = request.getServletPath();
		String directory = path.split("/")[1].split("\\.")[0];
		String action = request.getParameter("action");
		String page = request.getParameter("page");
		System.out.println("Separator PATH:   " + path);
		System.out.println("Separator DIR:   " + directory);
		System.out.println("Separator ACTION:   " + action);
		System.out.println("Separator PAGE:   " + page);
		command = CommandFactory.create(directory, action, page);
	}
	
	public static String[] getAll(String path) {
		String[] dir = new String[4];
		dir[0] = "/WEB-INF/jsp/" + path.split("/")[1] + "/";
		dir[1] = path.split("/")[2].split("\\.")[0];
		dir[2] = ".jsp";
		dir[3] = dir[0] + dir[1] + dir[2];
		return dir;
	}
}
