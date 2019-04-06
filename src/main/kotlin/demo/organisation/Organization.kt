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