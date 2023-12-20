# EmployWise

This repository contains an Employee Management API that allows you to perform various operations related to employee management, such as adding, retrieving, updating, and deleting employee records in a database.

Table of Contents

-Add Employee to a Database
-Get All Employees
-Delete Employee by ID
-Update Employee by ID
-Add Employee to a Database

Endpoint
POST /employees

Description
This API endpoint allows you to add a new employee to the database. The employee data should include the following fields:

name: Name of the employee.
phoneNumber: Contact number of the employee.
email: Email address of the employee.
reportTO: Employee ID of the reporting manager.
ImageURL: URL to the employee's profile image (use Google Images).
Additionally, a unique UUID is generated as the ID field for the employee, and this ID is returned if the employee is successfully added to the database.

Request Example
json
{
  "name": "John Doe",
  "phoneNumber": "123-456-7890",
  "email": "john.doe@example.com",
  "ReportTO": "manager_employee_id",
  "imageURL": "https://example.com/profile_image_url.jpg"
}

Response Example
JSON
{
  "ID": "unique_employee_id"
}
Get All Employees
Endpoint
GET /employees

Description
This API endpoint retrieves all employees from the database.

Response Example
json
[
  {
    "ID": "employee_id_1",
    "Name": "John Doe",
    "phoneNumber": "123-456-7890",
    "email": "john.doe@example.com",
    "reportTO": "manager_employee_id",
    "imageURL": "https://example.com/profile_image_url.jpg"
  },
  {
    "ID": "employee_id_2",
    "name": "Jane Doe",
    "phoneNumber": "987-654-3210",
    "email": "jane.doe@example.com",
    "reportTO": "manager_employee_id",
    "imageURL": "https://example.com/profile_image_url.jpg"
  }
  // ... other employees
]



Delete Employee by ID
Endpoint
DELETE /employees/{employee_id}

Description
This API endpoint deletes an employee from the database based on their ID.

Response Example
JSON
{
  "message": "Employee successfully deleted"
}



Update Employee by ID
Endpoint
PUT /employees/{employee_id}

Description
This API endpoint updates the details of an employee in the database based on their ID. You can provide the fields you want to update in the request body.

Request Example
JSON
{
  "phoneNumber": "111-222-3333",
  "imageURL": "https://example.com/new_profile_image_url.jpg"
}
Response Example
JSON
{
  "message": "Employee details successfully updated"
}
