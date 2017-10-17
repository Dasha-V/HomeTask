package by.academy.dv.java.task28;
public class Mark {

	private String name;
	private int mark;
	public Mark(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Mark [name=" + name + ", mark=" + mark + "]";
	}
	
	

}