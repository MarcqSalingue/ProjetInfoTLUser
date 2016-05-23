/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package main.java.userModel;
import java.io.File;
import java.nio.file.DirectoryStream.Filter;
import java.util.HashSet;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

import java.util.List;
import java.util.Iterator;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of UserDB.
 * 
 * @author humar
 */
public class UserDB {
	/**
	 * Description of the property groups.
	 */
	public HashSet<Group> groups = new HashSet<Group>();

	/**
	 * Description of the property file.
	 */
	private String file = "";

	/**
	 * Description of the property users.
	 */
	public HashSet<User> users = new HashSet<User>();

	// Start of user code (user defined attributes for UserDB)

	// End of user code

	/**
	 * The constructor.
	 */
	public UserDB(String file)  {
		super();
		this.file = file;
	}

	/**
	 * Description of the method loadDB.
	 */
	public void loadDB() {
		// Start of user code for method loadDB
		// End of user code
	}

	/**
	 * Description of the method saveDB.
	 */
	public void saveDB() {
		// Start of user code for method saveDB
		// End of user code
	}

	/**
	 * Description of the method groupsIdToString.
	 */
	public void groupsIdToString() {
		// Start of user code for method groupsIdToString
		// End of user code
	}

	/**
	 * Description of the method usersLoginToString.
	 */
	public void usersLoginToString() {
		// Start of user code for method usersLoginToString
		//SAXBuilder builder = new SAXBuilder();
		//File xmlFile = new File(this.file);
		// End of user code
	}

	/**
	 * Description of the method studentsLoginToString.
	 */
	public void studentsLoginToString() {
		// Start of user code for method studentsLoginToString
		// End of user code
	}

	/**
	 * Description of the method usersToString.
	 */
	public void usersToString() {
		// Start of user code for method usersToString
		// End of user code
	}

	/**
	 * Description of the method groupsToString.
	 */
	public void groupsToString() {
		// Start of user code for method groupsToString
		// End of user code
	}

	// Start of user code (user defined methods for UserDB)

	// End of user code
	/**
	 * Returns groups.
	 * @return groups 
	 */
	public HashSet<Group> getGroups() {
		return this.groups;
	}

	/**
	 * Returns file.
	 * @return file 
	 */
	public String getFile() {
		return this.file;
	}

	/**
	 * Sets a value to attribute file. 
	 * @param newFile 
	 */
	public void setFile(String newFile) {
		this.file = newFile;
	}

	/**
	 * Returns users.
	 * @return users 
	 */
	public HashSet<User> getUsers() {
		return this.users;
	}

}
