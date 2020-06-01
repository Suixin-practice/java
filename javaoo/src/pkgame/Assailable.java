package pkgame;
/**
 * 可攻击接口-相当于实现了之后具备了可实施攻击对象的基本特征
 * @author 40623
 *
 */
public interface Assailable {
	String getName();
	int getx();
	int gety();
	void sety(int y);
	void setx(int x);
	int getHP();
	void setHP(int HP);
	//根据距离判断，是否可以成功攻击另一个对象
	boolean canFightByDistance(Assailable assa);
	//攻击另一个具备攻击能力的对象
	void fight(Assailable assa);
	
}
