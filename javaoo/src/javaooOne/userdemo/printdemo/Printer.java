package javaooOne.userdemo.printdemo;



import javaooOne.userdemo.printdemo.iface.IInkBox;
import javaooOne.userdemo.printdemo.iface.IPaper;

public class Printer {
	private IInkBox inkbox=null;
	private IPaper paper=null;
	
	/**
	 * 打印方法
	 */
	public void print(String content) {
		if(null==inkbox||null==paper) {
			System.out.println("安装错误");
			return;
		}
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("一下文字是"+color+"颜色");
		System.out.println("使用"+type);
		System.out.println("打印内容"+content);
	}
	public IInkBox getInkbox() {
		return inkbox;
	}
	public void setInkbox(IInkBox inkbox) {
		this.inkbox = inkbox;
	}
	public IPaper getPaper() {
		return paper;
	}
	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	
}
