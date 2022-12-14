import {
  Button,
  ButtonGroup,
  emphasize,
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
} from "@mui/material";
import React from "react";
import List from "@mui/material/List";
import ListItem from "@mui/material/ListItem";
import ListItemText from "@mui/material/ListItemText";
import ListItemAvatar from "@mui/material/ListItemAvatar";
import Avatar from "@mui/material/Avatar";
import ImageIcon from "@mui/icons-material/Image";
import WorkIcon from "@mui/icons-material/Work";
import BeachAccessIcon from "@mui/icons-material/BeachAccess";
import Paper from "@mui/material/Paper";
import EmployeeService from "../../services/EmployeeService";
import { Stack } from "@mui/system";

export default function ListEmployees({ employees, setemployees }) {
  const employeeService = new EmployeeService();

  const handleRemove = (id) => {
    console.log(id);
    employeeService.deleteOneEmployee(id);
    let afterRemove = employees.filter((employee) => employee.id !== id);
    setemployees(afterRemove);
  };

  return (
    <>
      <Stack>
        <TableContainer sx={{ m: 2, p: 2 }} component={Paper}>
          <Table sx={{ minWidth: 650 }} aria-label="simple table">
            <TableHead>
              <TableRow>
                <TableCell align="left">ID</TableCell>
                <TableCell></TableCell>
                <TableCell align="left">Firstname</TableCell>
                <TableCell align="left">Lastname</TableCell>
                <TableCell align="center"> </TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {employees.map((emp) => (
                <TableRow
                  key={emp.id}
                  sx={{ "&:last-child td, &:last-child th": { border: 0 } }}
                >
                  <TableCell align="left">{emp.id}</TableCell>
                  <TableCell>
                    <Avatar
                      src={`images/${emp.id}.jpg`}
                      alt={`${emp.firstName} ${emp.lastName}`}
                    >
                      <ImageIcon />
                    </Avatar>
                  </TableCell>
                  <TableCell align="left">{emp.firstName}</TableCell>
                  <TableCell align="left">{emp.lastName}</TableCell>
                  <TableCell align="center">
                    <ButtonGroup orientation="vertical">
                      <Button>Edit</Button>
                      <Button onClick={() => handleRemove(emp.id)}>
                        Remove
                      </Button>
                    </ButtonGroup>
                  </TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
      </Stack>
    </>
  );
}
