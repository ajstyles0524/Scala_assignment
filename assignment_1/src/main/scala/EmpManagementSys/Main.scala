package EmpManagementSys

import EmpManagementSys.Services.{EmployeeService, AttendanceService}

object Main extends App{

     val consultant = EmployeeDetails("CONS", "ANAND", "JAISWAL", 40000.500)
     val manager = EmployeeDetails("MANA", "PAWAN", "BISHT", 78000.250)
     val seniorManager = EmployeeDetails("SRMA", "ATUL", "RAWAT", 100000.250)
     val president = EmployeeDetails("POTC", "VIKAS", "HAZRATI", 1000000.450)

     val employee_1 = EmployeeDetails("MANA", "PAWAN", "BISHT", 78000.250)

     println(EmployeeService.setEmp(consultant))
     println(EmployeeService.setEmp(manager))
     println(EmployeeService.setEmp(seniorManager))
     println(EmployeeService.setEmp(president))
     println(EmployeeService.setEmp(employee_1))

     AttendanceService.setEmployeeAttendance(consultant, "09:50 AM", "06:50 PM")
     AttendanceService.setEmployeeAttendance(seniorManager, "09:55 AM", "06:55 PM")
     AttendanceService.setEmployeeAttendance(president)
     AttendanceService.setEmployeeAttendance(seniorManager)
}