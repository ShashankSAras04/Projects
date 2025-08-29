import { useState } from 'react'
import './App.css'
import Header from './components/Header'
import Firstbody from './components/Firstbody'
import Aboutme from './components/Aboutme'
import Achievements from './components/Achievements'
import Myresume from './components/Myresume'
import Conatact from './components/Conatact'
import Projects from './components/Projects'
import Serviceoffered from './components/Serviceoffered'

function App() {


  return (
    <>
      <Header/>
      <Firstbody/>
      <Aboutme/>
      <Serviceoffered/>
      <Achievements/>
      <Myresume/>
      <Projects/>
      <Conatact/>
    </>
  )
}

export default App
