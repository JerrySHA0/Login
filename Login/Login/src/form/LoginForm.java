/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 06-10-2017
 * 
 * XDoclet definition:
 * @struts.form name="LoginForm"
 */
public class LoginForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** userName property */
	private String userName;

	/** password property */
	private String password;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the userName.
	 * @return String
	 */
	public String getUserName() {
		return userName;
	}

	/** 
	 * Set the userName.
	 * @param userName The userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}