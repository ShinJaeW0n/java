package Day16;

import java.util.Arrays;

public class WildCardEx{
		public static void registerCourse(Course<?> course) {
			System.out.println(course.getName() + "������: " 
			+ Arrays.toString(course.getStudents()));
			//�迭�� ���ڿ��� �ٲٴ°�.
			}
		
		public static void registerCourseStudent(Course<Student> studentCourse) {
			System.out.println(studentCourse.getName() + "������: "
				+ Arrays.toString(studentCourse.getStudents()));
		
		}
		
		public static void registerCourseWorker(Course<? super Worker> course) {
			System.out.println(course.getName() + "������: "
				+ Arrays.toString(course.getStudents()));
		
		}
		
		public static void main(String[] args) {
			Person person = new Person("�Ϲ���");
			Worker worker = new Worker("������");
			Student student = new Student("�л�");
			HighStudent highStudent = new HighStudent("����л�");
			 
			Course<Person> per = new Course<>("�Ϲ����ڽ�", 5);
			per.add(person);
			per.add(worker);
			per.add(student);
			per.add(highStudent);
		
			
			registerCourse(per);
		//	registerCourseStudent(perSonCourse); //<-�л��� ������� �ؾ��ؼ� �л��� �Է��� �ȵȴ�.
			registerCourseWorker(per);
		
	
			Course<Student> studentCourse = new Course<Student>("�л��ڽ�" , 5);
		//	studentCourse.add(person);
		//	studentCourse.add(worker);
			studentCourse.add(student);
			studentCourse.add(highStudent);
	
			registerCourse(studentCourse);
			registerCourseStudent(studentCourse);
		//	registerCourseWorker(studentCourse);
			System.out.println();
			
			Course<Worker> WorkerCourse = new Course<Worker>("�������ڽ�" , 5);
			
	//		WorkerCourse.add(person);
			WorkerCourse.add(worker);
	//		WorkerCourse.add(student);
	//		WorkerCourse.add(highStudent);
			
			registerCourse(WorkerCourse);
	//		registerCourseStudent(WorkerCourse);
			registerCourseWorker(WorkerCourse);
	
		}
	}
	
	
	

