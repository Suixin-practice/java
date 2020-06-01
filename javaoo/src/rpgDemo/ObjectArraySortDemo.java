package rpgDemo;
/**
 * 对象数组的排序显示
 * @author 40623
 *
 */
public class ObjectArraySortDemo {
	public static void main(String[] args) {
		warrior 战士1 = new warrior();
		warrior 战士2 = new warrior();
		warrior 战士3 = new warrior();
		warrior 战士4 = new warrior();
		warrior 战士5 = new warrior();
		ArchMage 法师1 = new ArchMage();
		ArchMage 法师2 = new ArchMage();
		ArchMage 法师3 = new ArchMage();
		ArchMage 法师4 = new ArchMage();
		ArchMage 法师5 = new ArchMage();
		Hero[] heroArray = {
				战士1,战士2,战士3,战士4,战士5,
				法师1,法师2,法师3,法师4,法师5
		};
		System.out.println("排序前：");
		for(Hero hero : heroArray) {
			System.out.println(hero);
		}
		sort(heroArray);
		System.out.println("排序后：");
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
