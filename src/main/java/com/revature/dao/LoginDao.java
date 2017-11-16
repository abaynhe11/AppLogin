
package com.revature.dao;

import java.util.List;

import com.revature.model.Login;

/* Contract interface that uses DAO design pattern rules that can be implemented
 * by many types of technologies like JDBC, Hibernate, MongoDB, etc.
 */
public interface LoginDao {
	public boolean insert(ADMIN_TF_USER ADMIN_TF_USER);
	public boolean insertProcedure(ADMIN_TF_USER ADMIN_TF_USERr);
	public ADMIN_TF_USER select(ADMIN_TF_USER ADMIN_TF_USER);
	public List<ADMIN_TF_USER> selectAll();
	public String getADMIN_TF_USERHASH( ADMIN_TF_USER);
}
