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

fun getTotalSalariesOfAllEmployees(employees: List<Employee>): Int {
    return getSalariesOfEmployees(employees).sum()
}

fun getTotalSalariesForDepartment(employees: List<Employee>, department: Department): Int {
    return employees
            .filter { it.department == department }
            .sumBy { it.salary }
}

fun getTotalSalariesForDepartments(employees: List<Employee>, departments: List<Department>): Int {
    return employees
            .filter { it.department in departments }
            .sumBy { it.salary }
}
