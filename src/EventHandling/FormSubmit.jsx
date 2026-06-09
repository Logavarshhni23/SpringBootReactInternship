import React from 'react'

export default function FormSubmit() {
    function handleSubmit(event){
        event.preventDefault()
        alert("Form submitted")
    }
  return (
    <div>
        <form onSubmit={handleSubmit}>
            <input type="text"/>
            <button type="submit">submit</button>
        </form>
    </div>
  )
}
