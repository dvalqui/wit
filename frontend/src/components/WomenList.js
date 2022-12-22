import React from "react";

const WomenList = ({women}) => {
   <ul>

 {women.map((woman, name) => <li key = {name}>{woman.name} </li>
    )}

    </ul>
}








export default WomenList; 