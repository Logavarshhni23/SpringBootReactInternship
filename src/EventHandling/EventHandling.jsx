import React, { useState } from 'react'

function EventHandling() {
    const[text,setText]=useState("");
    function handleChange(event){
        // alert(" clicked")
        setText(event.target.value);
    }
    return(
        <div>
            {/* <button onClick={handleChange}>click me</button> */}
            <input type="text" onChange={handleChange} value={text}/>
            <h1>{text}</h1>

        </div>
    )
}
export default EventHandling