package com.foodplaza.dao;

public interface AdminDao {
	boolean userLogin(String emailId,String Password);
	boolean userChangePassword(String emailId,String newPassword);
	boolean adminLogin(String adminemailId,String adminPassword);
	boolean adminChangePassword(String adminemailId,String adminnewPassword);


}
