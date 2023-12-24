package coreJava;

public class Encaps {
	String ename;
	int eid;
	float sal;
	int exp;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {

		this.sal = sal;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp, float sal) {
		if (exp <= 5)
			this.sal = 1.10f * sal;
		else
			this.sal = 1.30f * sal;
		this.exp = exp;
	}
}
