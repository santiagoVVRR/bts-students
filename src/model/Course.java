package model;

import java.util.ArrayList;
import java.util.List;

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
	
	/*
	public Student searchStudent(int c) {

		
	}*/
	
	public List<Student> preorder(){
		
		return preorder(root);
		
	}
	
	private List<Student> preorder(Student currentNode){
		List<Student> l = new ArrayList<>();
		if(currentNode != null) {
			l.add(currentNode);
			List<Student> ll = preorder(currentNode.getLeft());
			List<Student> lr = preorder(currentNode.getRight());
			l.addAll(ll);
			l.addAll(lr);
		}
		return l;
	}
	
	public List<Student> inorder(){
		
		return inorder(root);
		
	}
	
	private List<Student> inorder(){
		List<Student> m = ArrayList<>();
	}
	/**
	 * el mismo que el preorder de arriba pero con acumulacion de parametros
	 * @return
	 
	public List<Student> preorder(){
		List<Student> l = new ArrayList<>()
		preorder(root,l);
		return l;
	}
	
	private void preorder(Student cs, List<Student>) {
		if(cs != null) {
			l.add(cs);
			preorder(cs.getLeft(),l);
			preorder(cs.getRight(),l);
		}
	}*/

}