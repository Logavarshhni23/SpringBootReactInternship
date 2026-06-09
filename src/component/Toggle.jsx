import React, { useState } from 'react'

export default function Toggle() {
    const[change,setChange]=useState(false);
    function changeVariable(){
        setChange(!change);
    }
    return (
        <div>
            <h1>{change?"Off":"On"}</h1>
            <button onClick={changeVariable}>toggle</button>
        </div>
    )
}
