package EmpManagementSys

case class EmployeeDetails(prefix: String, firstName: String, lastName: String, salary: Double)
case class Consultant(empId: String, firstName: String, lastName: String, salary: Double) extends Employee
case class Manager(empId: String, firstName: String, lastName: String, salary: Double) extends Employee
case class SeniorManager(empId: String, firstName: String, lastName: String, salary: Double) extends Employee
case class President(empId: String, firstName: String, lastName: String, salary: Double) extends Employee


