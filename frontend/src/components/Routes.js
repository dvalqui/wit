import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import WomenInTechContainer from "../container/WomenInTechContainer";

const WomenRoutes = () =>
    <Router>
        <Routes>
            <Route path="/" element={<WomenInTechContainer />}></Route>
        </Routes>
    </Router>

export default WomenRoutes;
