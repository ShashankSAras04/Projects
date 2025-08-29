import { useState } from 'react'

import './App.css'
import Todolist from './component/Todolist'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Todolist/>
    </>
  )
}

export default App
