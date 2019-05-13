package model;

public class Student implements Comparable<Student> {

	private int code;
	private String name;
	
	private Student right;
	private Student left;
	
	
	public Student(int code,String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getRight() {
		return right;
	}

	public void setRight(Student right) {
		this.right = right;
	}

	public Student getLeft() {
		return left;
	}

	public void setLeft(Student left) {
		this.left = left;
	}

	@Override
	public int compareTo(Student c) {
		int anotherCode = c.getCode();
		
		if(code<anotherCode) {
			return -1;
		}else if(code>anotherCode) {
			return 1;
		}else {
			return 0;
		}
		
	}
		
	
	
	
	
	
}
