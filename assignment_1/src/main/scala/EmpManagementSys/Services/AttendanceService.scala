package EmpManagementSys.Services

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, ZoneId, LocalDateTime}
import EmpManagementSys.EmployeeDetails

object AttendanceService{
  def setEmployeeAttendance(emp: EmployeeDetails, startTime: String, endTime: String) = {
    try {
      val startDateTime = getTime(startTime)
      val endDateTime = getTime(endTime)
      val employee = EmployeeService.setEmp(emp)
      println(s"Employee Attendance: Employee: $employee StartTime: $startDateTime , EndTime:  $endDateTime")
      Some((startDateTime, endDateTime))
    } catch {
      case ex: Exception => ex.printStackTrace
        None
    }
  }
  def setEmployeeAttendance(emp: EmployeeDetails): Option[(String, String)] = {
    try {
      val startDateTime = getTime("09:45 AM")
      val endDateTime = getTime("06:45 PM")
      val employee = EmployeeService.setEmp(emp)
      println(s"EmployeeAttendance: Employee: $employee   StartTime: $startDateTime , EndTime:  $endDateTime")
      Some((startDateTime, endDateTime))
    } catch {
      case ex: Exception => ex.printStackTrace
        None
    }
  }

  def getTime(time: String): String = {
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")
    val localDateTime = LocalDateTime.parse(LocalDate.now.toString + " " + time, formatter)
    val dateTime = localDateTime.format(formatter)
    /*
     * Use this offsetDateTime to get the UTC zone time
     */
    val offsetDateTime = localDateTime.atZone(ZoneId.of("UTC")).toOffsetDateTime
    dateTime
  }
}