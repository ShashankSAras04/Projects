import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { createDepartment, getDepartment, modifyDepartment  } from '../services/DepartmentServices'



const DepartmentComponent = () => {
    const [deptName, setDeptName] = useState('')
    const [location, setLocation] = useState('')
    const navigate = useNavigate();
    const { id } = useParams();

    function handleDeptName(e) {
        setDeptName(e.target.value);
    }

    function handleLocation(e) {
        setLocation(e.target.value);
    }

    function saveDepartment(e) {
        e.preventDefault();
        const department = { dname: deptName, loc: location };
        console.log(department);
       if (id) {
                   modifyDepartment(id, department)
                       .then(response => {
                           console.log("Department modified successfully:", response.data);
                       })
                       .catch(error => {
                           console.error("Error modifying department:", error);
                       });
               }
               else {
                   createDepartment(department)
                       .then(response => {
                           console.log("Department created successfully:", response.data);
                       })
                       .catch(error => {
                           console.error("Error creating department:", error);
                       });
               }
               navigate('/departments'); // Redirect to the list of departments after creation
       
           }

    const fetchDepartment = (id) => {
        getDepartment(id).then(response => {
            const department = response.data;
            setDeptName(department.dname);
            setLocation(department.loc);
        }).catch(error => {
            console.error("Error fetching department:", error);
        });
    }

    useEffect(() => {
        if (id) {
            fetchDepartment(id);
        }
    }, [id])

    function cancelDepartment() {
        navigate('/departments');
    }

    function changeTitle() {
        if (id) {
            return <h2
                            className="text-center fw-bold"
                            style={{ color: "#0d6efd", marginBottom: "20px" }}>
                            Edit Department
                        </h2>
        } else {
            return <h2
                            className="text-center fw-bold"
                            style={{ color: "#0d6efd", marginBottom: "20px" }}>
                            Add Department
                        </h2>
        }
    }
    return (
        <div
            style={{
                minHeight: "100vh",
                background: "linear-gradient(135deg, #e3f2fd, #f1f8e9)",
                paddingTop: "50px",
            }}>
            <div className="container">
                <div className="row justify-content-center">
                    <div
                        className="card shadow-lg border-0"
                        style={{
                            borderRadius: "15px",
                            maxWidth: "500px",
                            padding: "20px",
                            background: "#ffffff",
                        }}>
                        {
                            changeTitle()
                        }
                        <div className="card-body">
                            <form>
                                <div className="form-group mb-3">
                                    <label style={{ fontWeight: "600", color: "#333" }}>Department Name</label>
                                    <input
                                        type="text"
                                        className="form-control form-control-lg"
                                        placeholder="Enter Department Name"
                                        name="deptName"
                                        value={deptName}
                                        onChange={handleDeptName}
                                        style={{ borderRadius: "8px" }} />
                                </div>

                                <div className="form-group mb-4">
                                    <label style={{ fontWeight: "600", color: "#333" }}>Location </label>
                                    <input
                                        type="text"
                                        className="form-control form-control-lg"
                                        placeholder="Enter Location"
                                        name="location"
                                        value={location}
                                        onChange={handleLocation}
                                        style={{ borderRadius: "8px" }} />
                                </div>

                                <div className="text-center">
                                    <button
                                        type="button"
                                        className="btn btn-success btn-lg px-4 me-3"
                                        onClick={saveDepartment}
                                        style={{
                                            borderRadius: "8px",
                                            boxShadow: "0px 4px 8px rgba(0,0,0,0.2)"
                                        }}>
                                        <i className="bi bi-floppy"></i> Save
                                    </button>
                                    <button
                                        type="button"
                                        className="btn btn-danger btn-lg px-4"
                                        onClick={cancelDepartment}
                                        style={{
                                            borderRadius: "8px",
                                            boxShadow: "0px 4px 8px rgba(0,0,0,0.2)"
                                        }}>
                                        <i className="bi bi-x-circle-fill"></i> Cancel
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    )
}

export default DepartmentComponent