import React from "react";
import Box from '@mui/material/Box';
import List from '@mui/material/List';
import ListItem from '@mui/material/ListItem';
import ListItemButton from '@mui/material/ListItemButton';

const WomenList = ({ women }) => (
   <List>

      {women.map((woman) => <ListItem key={woman.id}>
         <ListItemButton>{woman.name}</ListItemButton>
      </ListItem>
      )}

   </List>

)


export default WomenList;