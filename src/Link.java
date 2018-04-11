
public class Link {

	private Page page;
	private Link next;
	private Link prev;
	
	public Link(Page page, Link next, Link prev) {
		super();
		this.page = page;
		this.next = next;
		this.prev = prev;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Link getPrev() {
		return prev;
	}

	public void setPrev(Link prev) {
		this.prev = prev;
	}
	
	
}
