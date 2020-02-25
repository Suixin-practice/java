package productdemo;

import javax.swing.JOptionPane;

public class ProductBiz {
	public static void main(String[] args) {
		//用来保存每种商品的总量
		int[] counts = new int[3];
		double total =0;//支付金额
		for (int i = 0; i < counts.length; i++) {
			Product product = new Product();
			String name = JOptionPane.showInputDialog("请输入商品名称");
			product.setName(name);
			//接受用户输入的商品的单价，返回值是字符串类型
			String strPrice = JOptionPane.showInputDialog("请输入商品的单价:");
			//需要将字符串转换为double类型
			//转换前进行验证
			product.setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("请输入购买的数量");
			counts[i] = Integer.parseInt(strCount);
			
			//累加总金额
			total += product.getPrice() * counts[i];
		}
		System.out.println("商品的总金额为"+total);
	}
}
