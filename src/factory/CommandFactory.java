package factory;

import command.Command;
import command.ListCommand;

public class CommandFactory {
	public static Command create(String directory, String action, String page) {
		return new Command(directory, action, page);
	}
	
	public static Command create(String directory, String action, String page, String pageNo) {
		Command cmd = null;
		switch (action) {
		case "list":
			cmd = new ListCommand(directory, action, page, pageNo);
			break;
		}
		return cmd;
	}
}
