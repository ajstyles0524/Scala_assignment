package EmpManagementSys.Services
import java.util.UUID
import EmpManagementSys._

object EmployeeService{
  def setEmp(emp: EmployeeDetails): Option[Employee] = {
         emp.prefix match{
           case "CONS" => Some(Consultant(emp.prefix + "-" + UUID.randomUUID().toString, emp.firstName, emp.lastName, emp.salary))
           case "MANA" => Some(Manager(emp.prefix +  "-" + UUID.randomUUID().toString, emp.firstName, emp.lastName, emp.salary))
           case "SRMA" => Some(SeniorManager(emp.prefix +  "-" + UUID.randomUUID().toString, emp.firstName, emp.lastName, emp.salary))
           case "POTC" => Some(President(emp.prefix +  "-" + UUID.randomUUID().toString, emp.firstName, emp.lastName, emp.salary))
           case _ => None
         }
  }
}
