import React, { useState, useEffect } from 'react'
import { getAllDepartments, deleteDepartment } from '../services/DepartmentServices';
import { useNavigate } from 'react-router-dom';

const ListDepartments = () => {
    const [departments, setdepartments] = useState([]);
    const navigate = useNavigate();


    useEffect(() => {
        displayDepartments()
    }, [])

    const displayDepartments = () => {
        getAllDepartments().then((response) => {
            console.log(response.data);
            setdepartments(response.data)
        }).catch((error) => {
            console.error("Error fetching Departments", error);
        })
    }


    const createDepartment = () => {
        navigate('/createdept');
    }


    function removeDepartment(deptid) {
        if (deptid) {
            const status1 = confirm("Are you sure you want to delete this department?");
            if (status1) {
                deleteDepartment(deptid).then((response) => {
                    console.log(response.data);
                    console.log(deptid)
                    displayDepartments();
                }).catch((error) => {
                    console.error("Error deleting department:", error);
                })
            }
        }

    }

    function editDepartment(deptid) {
        navigate(`/editdept/${deptid}`);
    
    }

    return (
        <div>
            <h3 className='text-center mt-3'>List of Departments</h3>
            <button className='bi bi-building-fill-add btn btn-primary' onClick={createDepartment} style={{ "margin-left": 1200, "margin-bottom": 20 }}> Add Department</button>
            <table className='table table-striped table-hover table-bordered table-sm w-75 mx-auto shadow text-center'>
                <thead >
                    <tr>
                        <th>Department ID</th>
                        <th>Department Name</th>
                        <th>Location</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        departments.map((department => {
                            return (
                                <tr key={department.id}>
                                    <td>{department.id}</td>
                                    <td>{department.dname}</td>
                                    <td>{department.loc}</td>
                                    <td>
                                        <button className='bi bi-pencil-square btn btn-info'onClick={() => editDepartment(department.id)}> Edit</button>
                                        <button className='bi bi-trash btn btn-danger ms-5' onClick={() => removeDepartment(department.id)}> Delete</button>
                                    </td>
                                </tr>
                            )
                        }))
                    }
                </tbody>
            </table>
        </div>
    )
}

export default ListDepartments