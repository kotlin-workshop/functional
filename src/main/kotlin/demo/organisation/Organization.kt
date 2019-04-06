package demo.organisation

class Employee(
        val name: String,
        var salary: Int,
        val department: Department
)

class Department(val name: String) {
}

fun getSalariesOfEmployees(employees: List<Employee>): List<Int> {
    return employees.map { it.salary }
}

private fun getTotalSalaryByCriteria(employees: List<Employee>, function: (Employee) -> Boolean): Int {
    return employees.filter (function).sumBy { it.salary }
}

fun getTotalSalariesOfAllEmployees(employees: List<Employee>): Int {
    return getTotalSalaryByCriteria(employees) { true }
}

fun getTotalSalariesForDepartment(employees: List<Employee>, department: Department): Int {
    return getTotalSalaryByCriteria(employees) { it -> it.department == department }
}

fun getTotalSalariesForDepartments(employees: List<Employee>, departments: List<Department>): Int {
    return getTotalSalaryByCriteria(employees) { it.department in departments }
}

