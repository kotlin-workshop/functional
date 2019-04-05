package demo.organisation

class Employee(
        val name: String,
        var salary: Int,
        val department: Department
)

class Department(val name: String) {
}