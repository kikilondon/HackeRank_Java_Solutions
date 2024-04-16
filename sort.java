import java.util.*;

class Student {
    	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}

}

public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

        		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
        
    }
    // Define a custom comparator for sorting Student objects
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // First compare by CGPA in descending order
                if (s1.getCgpa() != s2.getCgpa()) {// if CGPA is different, 
                    return Double.compare(s2.getCgpa(), s1.getCgpa());// compare CGPA in descending order
                } else {
                    // If CGPA is the same, compare by first name in alphabetical order
                    if (!s1.getFname().equals(s2.getFname())) {//if first name is different 
                        return s1.getFname().compareTo(s2.getFname());// compare first name in alphabetical order
                    } else {
                        // If first name is also the same, compare by ID in ascending order
                        return Integer.compare(s1.getId(), s2.getId());
                    }
                }
            }
        };

        // Sort the studentList using the custom comparator
        Collections.sort(studentList, studentComparator);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

        in.close();
    
}
}
