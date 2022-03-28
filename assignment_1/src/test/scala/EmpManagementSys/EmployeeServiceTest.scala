package EmpManagementSys

import org.scalatest.flatspec.AnyFlatSpec
import EmpManagementSys.Services.EmployeeService

class EmployeeServiceTest extends AnyFlatSpec {
  val consultant = EmployeeDetails("CONS", "ANAND", "JAISWAL", 40000.500)
  val manager = EmployeeDetails("MANA", "PAWAN", "BISHT", 78000.250)
  val seniorManager = EmployeeDetails("SRMA", "ATUL", "RAWAT", 100000.250)
  val president = EmployeeDetails("POTC", "VIKAS", "HAZRATI", 1000000.450)
  val hr = EmployeeDetails("HR","PAPPU","GIRI",10000.025)

  "EmployeeService" should "return Consultant if it match to consultant" in {
    val result = EmployeeService.setEmp(consultant)
    assert(result.get.empId.contains("CONS"))
  }
  "EmployeeService" should "return Manager if it match to consultant" in {
    val result = EmployeeService.setEmp(manager)
    assert(result.get.empId.contains("MANA"))
  }
  "EmployeeService" should "return SeniorManager if it match to consultant" in {
    val result = EmployeeService.setEmp(seniorManager)
    assert(result.get.empId.contains("SRMA"))
  }
  "EmployeeService" should "return President if it match to consultant" in {
    val result = EmployeeService.setEmp(president)
    assert(result.get.empId.contains("POTC"))
  }
  "EmployeeService" should "return None if does not match to any employee type " in {
    val result = EmployeeService.setEmp(hr)
    println(result)
    assert(result == None)
  }
  "EmployeeService" should " return employee first name" in {
    val result = EmployeeService.setEmp(consultant)
    assert(result.get.firstName == consultant.firstName  )
  }
}