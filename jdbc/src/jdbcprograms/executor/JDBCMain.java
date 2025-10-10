package jdbcprograms.executor;

import jdbcprograms.services.CrudOperations;

public class JDBCMain {

	public static void main(String[] args) {
		CrudOperations.addStudent(101, "Seetha");
		CrudOperations.addStudent(102, "Geetha");
		CrudOperations.addStudent(103, "Ramu");

	}

}
