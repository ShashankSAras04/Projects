import React, { useState } from "react";

const Todolist = () => {
	const [todos, setTodos] = useState([]);
	const [input, setInput] = useState("");
	const [editId, setEditId] = useState(null);
	const [editText, setEditText] = useState("");

	// Create
	const handleAddTodo = (e) => {
		e.preventDefault();
		if (input.trim() === "") return;
		setTodos([...todos, { id: Date.now(), text: input }]);
		setInput("");
	};

	// Delete
	const handleDelete = (id) => {
		setTodos(todos.filter((todo) => todo.id !== id));
	};

	// Start Edit
	const handleEdit = (id, text) => {
		setEditId(id);
		setEditText(text);
	};

	// Update
	const handleUpdate = (e) => {
		e.preventDefault();
		setTodos(
			todos.map((todo) =>
				todo.id === editId ? { ...todo, text: editText } : todo
			)
		);
		setEditId(null);
		setEditText("");
	};

	return (
		<div style={{ maxWidth: 400, margin: "2rem auto", padding: 20, border: "1px solid #ccc", borderRadius: 8 }}>
			<h2>Todo List</h2>
			<form onSubmit={handleAddTodo} style={{ display: "flex", gap: 8 }}>
				<input
					type="text"
					value={input}
					onChange={(e) => setInput(e.target.value)}
					placeholder="Add a new todo"
					style={{ flex: 1, padding: 6 }}
				/>
				<button type="submit">Add</button>
			</form>
			<ul style={{ listStyle: "none", padding: 0, marginTop: 20 }}>
				{todos.map((todo) => (
					<li key={todo.id} style={{ marginBottom: 12, display: "flex", alignItems: "center", gap: 8 }}>
						{editId === todo.id ? (
							<form onSubmit={handleUpdate} style={{ display: "flex", gap: 8, flex: 1 }}>
								<input
									type="text"
									value={editText}
									onChange={(e) => setEditText(e.target.value)}
									style={{ flex: 1, padding: 6 }}
								/>
								<button type="submit">Save</button>
								<button type="button" onClick={() => setEditId(null)}>Cancel</button>
							</form>
						) : (
							<>
								<span style={{ flex: 1 }}>{todo.text}</span>
								<button onClick={() => handleEdit(todo.id, todo.text)}>Edit</button>
								<button onClick={() => handleDelete(todo.id)}>Delete</button>
							</>
						)}
					</li>
				))}
			</ul>
		</div>
	);
};

export default Todolist;
