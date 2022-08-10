import "./App.css";
import AdminAppBar from "./components/AdminAppBar";
import ListUsers from "./components/users/ListUsers";

function App() {
  return (
    <div className="App">
      <AdminAppBar />
      <ListUsers/>
      
    </div>
  );
}

export default App;
