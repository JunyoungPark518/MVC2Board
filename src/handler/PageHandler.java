package handler;

import java.util.HashMap;
import java.util.Map;

import util.Pagination;

public class PageHandler implements Orderable{
	Map<?,?> map;
	public PageHandler() {
		map = new HashMap<>();
	}
	
	public int[] getAttr() {
		Pagination page = new Pagination();
		String pageNo = (String) map.get("pageNo");
		String count = (String) map.get("count");
		page.setBlockSize(5);
		page.setRowCount(5);
		page.setCount(Integer.parseInt(count));
		page.setPageNo(pageNo);
		page.setPageStart();
		page.setPageEnd();	
		page.setPageCount();
		page.setBlockStart();
		page.setPrevBlock();
		page.setNextBlock();
		page.setBlockEnd();
		return page.getAttr();
	}
	
	@Override
	public void process(Map<?, ?> map) {
		this.map = map;
	}
}
