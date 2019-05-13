package model;

public class Course {

	private Student root;
	
	public Course() {
		
	}
	
	public void addStudent(int c, String n) {
		Student s = new Student(c, n);
		if(root==null) {
			root=s;
		}else {
			Student current = root;
			boolean added=false;
			while(!added) {
				if(s.compareTo(current)<=0) {
					if(current.getLeft()==null) {
						current.setLeft(s);
						added=true;
					}else {
						current=current.getLeft();
					}
				}else {
						if(current.getRight()==null) {
							current.setRight(s);
							added=true;
						}else {
							current=current.getRight();
						}
					}
				}
			}
		
	}
	
	
	public Student searchStudent(int c) {

		
	}

}