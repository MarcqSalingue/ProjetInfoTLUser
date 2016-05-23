/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userController;

import userController.IUserController;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of UserController.
 * 
 * @author humar
 */
public class UserController implements IUserController {
	/**
	 * Description of the property userDB.
	 */
	public UserDB userDB = null;

	// Start of user code (user defined attributes for UserController)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserController() {
		// Start of user code constructor for UserController)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for UserController)

	// End of user code
	/**
	 * Returns userDB.
	 * @return userDB 
	 */
	public UserDB getUserDB() {
		return this.userDB;
	}

	/**
	 * Sets a value to attribute userDB. 
	 * @param newUserDB 
	 */
	public void setUserDB(UserDB newUserDB) {
		if (this.userDB != null) {
			this.userDB.set(null);
		}
		this.userDB.set(this);
	}

}
