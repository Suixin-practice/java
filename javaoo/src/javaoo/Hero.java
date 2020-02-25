package javaoo;

public class Hero {
	private long id;
	private String nickname;
	private int level;
	private long currExp;
	private long exp;

	public Hero() {
		super();
	}
	
	public long getCurrExp() {
		return currExp;
	}

	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}

	public Hero(String nickname) {
		this.setNickname(nickname);
	}
	public Hero(long id, String nickname, int level, long exp) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.level = level;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <=0) id =1;
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	private void setNickname(String nickname) {
		if(nickname == null) {
			nickname ="Î´ÖªÓ¢ÐÛ";
		}else {
			this.nickname = nickname;
		}
		this.nickname = nickname;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level <1 || level >999) {
			this.level=1;
		}else {
			this.level = level;
		}
		this.level = level;
	}

	public long getExp() {
		exp= ((long)Math.pow(level-1, 3)+60)/5*((level-1)*2+60);
		return exp;
	}

}
