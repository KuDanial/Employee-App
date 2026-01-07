<!DOCTYPE html>
<html>
<head><title>Add Employee</title></head>
<body>
    <h1>Add New Employee</h1>
    <form action="EmpController" method="POST">
        <input type="hidden" name="action" value="add">
        Name: <input type="text" name="name" required><br><br>
        Salary: <input type="number" name="salary" step="0.01" required><br><br>
        Designation: <input type="text" name="designation" required><br><br>
        <input type="submit" value="Save">
    </form>
</body>
</html>