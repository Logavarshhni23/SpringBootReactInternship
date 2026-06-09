import React, { useState } from 'react'

export default function Todolist() {
  const[task,setTask]=useState('')
  const[todo,setTodo]=useState([])
  function handleTask(event){
    setTask(event.target.value);
  }
  function handleTodo(event){
    event.preventDefault();
    setTodo([...todo,task]);
    setTask('');
  }
  return (
    <div>
      <h1>To-do List</h1>
        <form onSubmit={handleTodo}>
            <input type="text" onChange={handleTask} value={task}/>
            <button type="submit">Add Task</button>
        </form>
        <ul>
          {
            todo.map((task,index)=>{
                return <li key={index}>{task}</li>
            })
          }
        </ul>
    </div>
  )
}
