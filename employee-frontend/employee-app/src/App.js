import { useEffect, useState } from "react";
import "./App.css";
import AdminAppBar from "./components/AdminAppBar";
import ListEmployees from "./components/users/ListEmployee";
import EmployeeService from "./services/EmployeeService";
import { Route, Routes, Link } from "react-router-dom";
import AddEmployee from "./components/users/AddEmployee";
import Home from "./pages/Home";

function App() {
  const employeeService = new EmployeeService();
  const [employees, setemployees] = useState([]);
  const [refresh, setRefresh] = useState(false);
  useEffect(() => {
    employeeService.getAllEmployees().then((resp) => setemployees(resp.data));
  }, [refresh]);

  return (
    <div className="App">
      <AdminAppBar />

      <Routes>
        <Route path="admin/employees/add" element={<AddEmployee />} />
        <Route
          path="admin/employees/list"
          element={
            <ListEmployees employees={employees} setemployees={setemployees} />
          }
        />
        <Route path="/" element={<Home />} />
      </Routes>
      <ListEmployees employees={employees} setemployees={setemployees} />
    </div>
  );
}

export default App;
