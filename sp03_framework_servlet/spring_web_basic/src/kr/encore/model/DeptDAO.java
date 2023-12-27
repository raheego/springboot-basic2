package kr.encore.model;

import java.sql.SQLException;
import java.util.List;

public interface DeptDAO {

	public List listDept();   // select
	public void insertDept(DeptDTO dto) throws SQLException;  // insert
	public void deleteDept(int deptno);

	
}
