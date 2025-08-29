import React, { useState } from "react";

const Fruits = () => {
  const [fruits, setFruits] = useState([
    { id: 1, name: "Watermelon", price: "180 rs", quantity: "20kg" },
    { id: 2, name: "Papaya", price: "90 rs", quantity: "10kg" },
    { id: 3, name: "Banana", price: "60 rs", quantity: "12kg" },
  ]);

  const [form, setForm] = useState({ name: "", price: "", quantity: "" });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleAdd = (e) => {
    e.preventDefault();
    if (!form.name || !form.price || !form.quantity) return;

    const newFruit = {
      id: Date.now(),
      ...form,
    };

    setFruits([...fruits, newFruit]);
    setForm({ name: "", price: "", quantity: "" });
  };

  const handleDelete = (id) => {
    const updated = fruits.filter((fruit) => fruit.id !== id);
    setFruits(updated);
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Fruit Inventory</h2>

      <form onSubmit={handleAdd} style={{ marginBottom: "20px" }}>
        <input
          type="text"
          name="name"
          placeholder="Fruit name"
          value={form.name}
          onChange={handleChange}
          style={{ marginRight: "10px" }}
        />
        <input
          type="text"
          name="price"
          placeholder="Price"
          value={form.price}
          onChange={handleChange}
          style={{ marginRight: "10px" }}
        />
        <input
          type="text"
          name="quantity"
          placeholder="Quantity"
          value={form.quantity}
          onChange={handleChange}
          style={{ marginRight: "10px" }}
        />
        <button type="submit">Add Fruit</button>
      </form>

      <table border="1" cellPadding="10" style={{ borderCollapse: "collapse" }}>
        <thead>
          <tr>
            <th>Name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {fruits.map((fruit) => (
            <tr key={fruit.id}>
              <td>{fruit.name}</td>
              <td>{fruit.quantity}</td>
              <td>{fruit.price}</td>
              <td>
                <button onClick={() => handleDelete(fruit.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Fruits;
