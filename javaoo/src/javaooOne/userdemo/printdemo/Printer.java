package javaooOne.userdemo.printdemo;



import javaooOne.userdemo.printdemo.iface.IInkBox;
import javaooOne.userdemo.printdemo.iface.IPaper;

public class Printer {
	private IInkBox inkbox=null;
	private IPaper paper=null;
	
	/**
	 * ��ӡ����
	 */
	public void print(String content) {
		if(null==inkbox||null==paper) {
			System.out.println("��װ����");
			return;
		}
		String color = inkbox.getColor();
		String type = paper.getSize();
		System.out.println("һ��������"+color+"��ɫ");
		System.out.println("ʹ��"+type);
		System.out.println("��ӡ����"+content);
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
