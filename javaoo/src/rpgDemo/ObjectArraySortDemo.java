package rpgDemo;
/**
 * ���������������ʾ
 * @author 40623
 *
 */
public class ObjectArraySortDemo {
	public static void main(String[] args) {
		warrior սʿ1 = new warrior();
		warrior սʿ2 = new warrior();
		warrior սʿ3 = new warrior();
		warrior սʿ4 = new warrior();
		warrior սʿ5 = new warrior();
		ArchMage ��ʦ1 = new ArchMage();
		ArchMage ��ʦ2 = new ArchMage();
		ArchMage ��ʦ3 = new ArchMage();
		ArchMage ��ʦ4 = new ArchMage();
		ArchMage ��ʦ5 = new ArchMage();
		Hero[] heroArray = {
				սʿ1,սʿ2,սʿ3,սʿ4,սʿ5,
				��ʦ1,��ʦ2,��ʦ3,��ʦ4,��ʦ5
		};
		System.out.println("����ǰ��");
		for(Hero hero : heroArray) {
			System.out.println(hero);
		}
		sort(heroArray);
		System.out.println("�����");
		for(Hero hero : heroArray) {
			System.out.println(hero);
		}
	}
	public static void sort(Hero[] heroArray) {
		Hero tempHero = null;
		for (int i = 0; i < heroArray.length; i++) {
			for (int j = 0; j < heroArray.length-1; j++) {
				if(heroArray[j].compareTobyName(heroArray[j+1])>0) {
					tempHero = heroArray[j];
					heroArray[j] = heroArray[j+1];
					heroArray[j+1] = tempHero;
				}
			}
		}
	}
}
