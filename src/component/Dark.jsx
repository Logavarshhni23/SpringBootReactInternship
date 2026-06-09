import {useState} from 'react'

function Dark(){
    const[dark,setDark]=useState(false);
    function ThemeChange(){
        setDark(!dark);
    }

     return(<div style={
        {backgroundColor:dark?"black":"white",
        color:dark?"white":"black",
        height:"100vh"
        }}>
        <h1>{dark ? "Dark" : "Light"}</h1>
        <button onClick={ThemeChange}>ThemeChange</button>
    </div>);
}
export default Dark;