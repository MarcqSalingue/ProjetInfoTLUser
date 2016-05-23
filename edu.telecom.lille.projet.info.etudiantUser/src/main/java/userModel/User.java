/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author humar
 */
public class User {
	/**
	 * Description of the property login.
	 */
	protected String login = "";

	/**
	 * Description of the property pwd.
	 */
	protected String pwd = "";

	/**
	 * Description of the property firstname.
	 */
	protected String firstname = "";

	/**
	 * Description of the property surname.
	 */
	protected String surname = "";

	/**
	 * Description of the property class.
	 */
	protected String class = "";
	
	// Start of user code (user defined attributes for User)
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public User() {
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	/**
	 * Description of the method getUserName.
	 * @param userLogin 
	 */
	public void getUserName(String userLogin) {
		
	}

	/**
	 * Description of the method getUserClass.
	 * @param userLogin 
	 * @param userPwd 
	 */
	public void getUserClass(String userLogin, String userPwd) {
		// Start of user code for method getUserClass
		// End of user code
	}

	/**
	 * Description of the method getStudentGroup.
	 * @param studentLogin 
	 */
	public void getStudentGroup(String studentLogin) {
		// Start of user code for method getStudentGroup
		// End of user code
	}

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Sets a value to attribute login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}

	/**
	 * Returns pwd.
	 * @return pwd 
	 */
	public String getPwd() {
		return this.pwd;
	}

	/**
	 * Sets a value to attribute pwd. 
	 * @param newPwd 
	 */
	public void setPwd(String newPwd) {
		this.pwd = newPwd;
	}

	/**
	 * Returns firstname.
	 * @return firstname 
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * Sets a value to attribute firstname. 
	 * @param newFirstname 
	 */
	public void setFirstname(String newFirstname) {
		this.firstname = newFirstname;
	}

	/**
	 * Returns surname.
	 * @return surname 
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Sets a value to attribute surname. 
	 * @param newSurname 
	 */
	public void setSurname(String newSurname) {
		this.surname = newSurname;
	}

	/**
	 * Returns class.
	 * @return class 
	 */
	public String getClass() {
		return this.class;
	}

	/**
	 * Sets a value to attribute class. 
	 * @param newClass 
	 */
	public void setClass(String newClass) {
	    this.class = newClass;
	}

}
