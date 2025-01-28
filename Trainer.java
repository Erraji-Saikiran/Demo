
public class Trainer {
      int id;
      String tname;
      String qualification;
      int salary;
      int courseId;
      
      public Trainer() {
    	  super();
      }
      public int getTid() {
  		return id;
  	}

  	public String getTname() {
  		return tname;
  	}

  	public String getQualification() {
  		return qualification;
  	}

  	public int getSalary() {
  		return salary;
  	}

  	public int getCourseId() {
  		return courseId;
  	}

  	public void setTid(int tid) {
  		this.id = tid;
  	}

  	public void setTname(String tname) {
  		this.tname = tname;
  	}

  	public void setQualification(String qualification) {
  		this.qualification = qualification;
  	}
  	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public Trainer(int id, String tname, String qualification, int salary, int courseId) {
		super();
		this.id = id;
		this.tname = tname;
		this.qualification = qualification;
		this.salary = salary;
		this.courseId = courseId;
	}
      
 
	

}
