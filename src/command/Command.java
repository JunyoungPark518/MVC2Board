package command;

import lombok.*;

@Data
public class Command {
	@Getter @Setter
	protected String directory, action, page, pageNo, searchWord;
	@Getter
	protected String view;
	
	public Command() {}
	public Command(String directory, String action, String page) {
		this.directory = directory;
		this.action = action;
		this.page = page;
		this.setView();
	}
	
	public void setView() {
		this.view = (this.directory.equals("home")) ? "/WEB-INF/jsp/common/" + this.page + ".jsp" :"/WEB-INF/jsp/" + this.directory + "/" + this.page + ".jsp";
	}
	
}