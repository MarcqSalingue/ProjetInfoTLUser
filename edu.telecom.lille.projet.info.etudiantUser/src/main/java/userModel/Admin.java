/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package main.java.userModel;
import main.java.userModel.User;
import main.java.userModel.UserDB;

/**
 * Description of Admin.
 * 
 * @author humar
 */
public class Admin extends User {

	static final int MAX_STUDENTS = 500;
	/**
	 * Description of the property adminID.
	 */
	
	protected int adminID;

	/**
	 * The constructor.
	 */
	public Admin() {
		// Start of user code constructor for Admin)
		super();
		// End of user code
	}

	/**
	 * Description of the method addAdmin.
	 * @param adminLogin 
	 * @param newAdminLogin 
	 * @param adminID 
	 * @param firstname 
	 * @param surname 
	 * @param pwd 
	 */
	public void addAdmin(String adminLogin, String newAdminLogin, Integer adminID, String firstname, String surname,
			String pwd) {
		// Start of user code for method addAdmin
		// End of user code
	}

	/**
	 * Description of the method addTeacher.
	 * @param adminLogin 
	 * @param newTeacherLogin 
	 * @param teacherID 
	 * @param firstname 
	 * @param surname 
	 */
	public void addTeacher(String adminLogin, String newTeacherLogin, Integer teacherID, String firstname,
			String surname) {
		// Start of user code for method addTeacher
		// End of user code
	}

	/**
	 * Description of the method addStudent.
	 * @param adminLogin 
	 * @param newStudentLogin 
	 * @param studentID 
	 * @param firstname 
	 * @param surname 
	 * @param pwd 
	 */
	public void addStudent(String adminLogin, String newStudentLogin, Integer studentID, String firstname,
			String surname, String pwd) {

		int i;
		for (i=0;i<=MAX_STUDENTS;i++) {
			if(newStudentLogin == UserDB.studentsLoginToString() )
		}
		
		Student newStudent = new Student();
		newStudent.login = newStudentLogin;
		newStudent.pwd = pwd;
		newStudent.studentID = studentID;
		newStudent.firstname = firstname;
		newStudent.surname = surname;
	}

	/**
	 * Description of the method removeUser.
	 * @param adminLogin 
	 * @param userLogin 
	 */
	public void removeUser(String adminLogin, String userLogin) {
		// Start of user code for method removeUser
		// End of user code
	}

	/**
	 * Description of the method addGroup.
	 * @param adminLogin 
	 * @param groupID 
	 */
	public void addGroup(String adminLogin, Integer groupID) {
		// Start of user code for method addGroup
		// End of user code
	}

	/**
	 * Description of the method removeGroup.
	 * @param adminLogin 
	 * @param groupID 
	 */
	public void removeGroup(String adminLogin, Integer groupID) {
		// Start of user code for method removeGroup
		// End of user code
	}

	/**
	 * Description of the method associateStudToGroup.
	 * @param adminLogin 
	 * @param studentLogin 
	 * @param groupID 
	 */
	public void associateStudToGroup(String adminLogin, String studentLogin, Integer groupID) {
		// Start of user code for method associateStudToGroup
		// End of user code
	}

	// Start of user code (user defined methods for Admin)

	// End of user code
	/**
	 * Returns adminID.
	 * @return adminID 
	 */
	public Integer getAdminID() {
		return this.adminID;
	}

	/**
	 * Sets a value to attribute adminID. 
	 * @param newAdminID 
	 */
	public void setAdminID(Integer newAdminID) {
		this.adminID = newAdminID;
	}

}
