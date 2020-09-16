package com.details.collect;

		import java.util.ArrayList;
		import java.util.List;

		class Student{
			private String name;
			private int age;
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			@Override
			public String toString() {
				return "Student [name=" + name + ", age=" + age + "]";
			}
			
			
		}

		 class Test1 {

			public  List<Student> loadstudent(){
				List<Student> stdlist = new ArrayList<>();
				
				
				/*
				Student stud = new Student();
				stud.setName("Hari");
				stud.setAge(25);
				stdlist.add(stud);
				
				Student stud2 = new Student();
				stud2.setName("Mani");
				stud2.setAge(30);
				stdlist.add(stud2);
				*/
				
				// From Database retrival 
				String name[] = {"Hari","Venkat","Gopi"};
				int age[] = {35,25,23};
				Student std1 = null;
				for(int i=0; i<name.length; i++) {
					std1 = new Student();
					std1.setName(name[i]);
					std1.setAge(age[i]);
					stdlist.add(std1);
				}
				
				return stdlist;
			}
			
			public static void main(String[] args) {
				
				Test1 obj = new Test1();
				List<Student> lt = obj.loadstudent();
//				System.out.println(lt);
				
		/*		for(int i=0; i<lt.size(); i++) {
					//System.out.println(lt.get(i));	
					Student st = lt.get(i);
					System.out.println(st.getName());
					System.out.println("Age :" + st.getAge());
				}
		*/		

				for(Student s : lt) {
					System.out.println(s.getName());
					System.out.println(s.getAge());
				}
				
			
	}

}
