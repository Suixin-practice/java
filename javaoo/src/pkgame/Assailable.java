package pkgame;
/**
 * �ɹ����ӿ�-�൱��ʵ����֮��߱��˿�ʵʩ��������Ļ�������
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
	//���ݾ����жϣ��Ƿ���Գɹ�������һ������
	boolean canFightByDistance(Assailable assa);
	//������һ���߱����������Ķ���
	void fight(Assailable assa);
	
}
