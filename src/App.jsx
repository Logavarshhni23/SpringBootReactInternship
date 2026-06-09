import Change from "./component/Change";
import Dark from "./component/Dark";
import List from "./component/ListandKeys/List";
import State from "./component/State";
import Student from "./component/Student"
import TextPass from "./component/TextPass";
import Toggle from "./component/Toggle";
import Welcome from "./component/Welcome";
import EventHandling from "./EventHandling/EventHandling";
import FormSubmit from "./EventHandling/FormSubmit";
import Todolist from "./TodoList/Todolist";

function App() {
  return (
    <div>
        {/* <Student title="Javascript"/>
        <Student name="Loga" title="Javascript"/>
        <Welcome name="React" duration={2}/>

        //UseState
        <State/>

        //Toggle
        <Toggle/>

        <TextPass/>

        <Dark/>
        <Change/>

        <EventHandling/>

        <FormSubmit/>

        <List/> */}

        <Todolist/>
    </div>    
  );
}

export default App;