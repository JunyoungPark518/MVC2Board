package util;

public class Pagination {
	private int pageNo, rowCount, blockSize, pageStart, pageEnd, pageCount, blockStart, prevBlock, nextBlock, blockEnd, count;
	
	public int[] getAttr(){
		int[] arr = {count, pageCount, pageNo, pageStart, pageEnd, blockStart, blockEnd, prevBlock, nextBlock};
		return arr;
	}
	
	public void setPageNo(String strPageNo) {
		this.pageNo = Integer.parseInt(strPageNo);
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

	public void setPageStart() {
		this.pageStart = (pageNo-1)*rowCount+1;
	}

	public void setPageEnd() {
		this.pageEnd = pageNo*rowCount;
	}

	public void setPageCount() {
		this.pageCount = (count%rowCount==0) ? count/rowCount : count/rowCount + 1;
	}

	public void setBlockStart() {
		this.blockStart = pageNo-((pageNo-1)%blockSize);
	}

	public void setPrevBlock() {
		this.prevBlock = blockStart - blockSize;
	}

	public void setNextBlock() {
		this.nextBlock =blockStart + blockSize;
	}

	public void setBlockEnd() {
		this.blockEnd = (blockStart+rowCount-1 < pageCount) ? blockStart+blockSize-1 : pageCount;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
