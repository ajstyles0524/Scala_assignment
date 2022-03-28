package EmpManagementSys

import EmpManagementSys.Services.AttendanceService
import org.scalatest.flatspec.AnyFlatSpec

class AttendanceServiceSpec extends AnyFlatSpec {
  val consultant = EmployeeDetails("CONS", "ANAND", "JAISWAL", 40000.500)
  val manager = EmployeeDetails("MANA", "PAWAN", "BISHT", 78000.250)
  val seniorManager = EmployeeDetails("SRMA", "ATUL", "RAWAT", 100000.250)
  val president = EmployeeDetails("POTC", "VIKAS", "HAZRATI", 1000000.450)
  val hr = EmployeeDetails("HR","PAPPU","GIRI",10000.025)

  "AttendanceService" should "return default In and Out Time" in {
    val resultConsultant = AttendanceService.setEmployeeAttendance(consultant)
    val resultManager = AttendanceService.setEmployeeAttendance(manager)
    val resultSrManager = AttendanceService.setEmployeeAttendance(seniorManager)
    val resultPresident = AttendanceService.setEmployeeAttendance(president)
    assert(resultConsultant.get._1.contains("09:45"))
    assert(resultConsultant.get._2.contains("06:45"))
    assert(resultManager.get._1.contains("09:45"))
    assert(resultManager.get._2.contains("06:45"))
    assert(resultSrManager.get._1.contains("09:45"))
    assert(resultSrManager.get._2.contains("06:45"))
    assert(resultPresident.get._1.contains("09:45"))
    assert(resultPresident.get._2.contains("06:45"))
  }
  "AttendanceService" should "return manual In and Out Time" in {
    val result = AttendanceService.setEmployeeAttendance(consultant, "09:00 AM","06:00 PM")
    assert(result.get._1.contains("09:00"))
    assert(result.get._2.contains("06:00"))
  }

}