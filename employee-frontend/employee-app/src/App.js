import { useEffect, useState } from "react";
import "./App.css";
import AdminAppBar from "./components/AdminAppBar";
import ListEmployees from "./components/users/ListEmployee";
import EmployeeService from "./services/EmployeeService";

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
      <ListEmployees employees={employees} setemployees={setemployees} />
    </div>
  );
}

export default App;
