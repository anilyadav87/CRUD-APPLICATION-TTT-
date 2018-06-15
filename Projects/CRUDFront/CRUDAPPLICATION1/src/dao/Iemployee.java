package dao;

import com.anil.model.EmployeeModel;
import java.util.List;
public interface Iemployee {

	public void insertRecord(EmployeeModel employeeModel);
	public void deleteRecord(int eId);
	public List<EmployeeModel> employeeList();
	
}
