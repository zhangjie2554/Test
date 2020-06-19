package xuliehua;

import java.io.Serializable;

//要将对象实例化到本地，必须实现Serializable接口
public class Student implements Serializable {
	
	private int id;
	//被transient修饰的属性，不会被序列化到本地
	private transient String name;
	private String sex;
	private String phone;
	private String add;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String sex, String phone, String add) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", add=" + add + "]";
	}
	
	
	

}
