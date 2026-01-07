<!DOCTYPE html>
<html>
<head><title>Edit Employee</title></head>
<body>
    <h1>Edit Employee</h1>
    <form action="EmpController" method="POST">
        <input type="hidden" name="action" value="edit">
        ID (Read Only): <input type="text" name="id" value="${param.id}" readonly><br><br>
        Name: <input type="text" name="name" value="${param.name}" required><br><br>
        Salary: <input type="number" name="salary" value="${param.salary}" step="0.01" required><br><br>
        Designation: <input type="text" name="designation" value="${param.designation}" required><br><br>
        <input type="submit" value="Update">
    </form>
</body>
</html>