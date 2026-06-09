import {useState} from 'react'

function Dice(){
    const [count,setCount]=useState(1);

    function handle(){
        setCount(Math.floor(Math.random()*6)+1);
    }
    return(<div>
        <button onClick={handle}>dice</button>
        <h1>{count}</h1>
        </div>);

}
export default Dice