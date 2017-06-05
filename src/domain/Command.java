package domain;

import handler.CommandHandler;

public class Command implements CommandHandler {
	private String directory, action, page;
	private String view;

	public Command(String directory, String action, String page){
		this.directory = directory;
		this.action = action;
		this.page = page;
	}

	@Override
	public Command process() {
		return null;
	}
	
	public void setView(){
		this.view = (this.directory.equals("home")) ? "/WEB-INF/jsp/common/" + this.page + ".jsp" : "/WEB-INF/jsp/" + this.directory + "/" + this.page + ".jsp";
	}
	
	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
}
