import React, { useEffect, useState } from "react";
import WomenList from "../components/WomenList";

function WomenInTechContainer() {
    const [women, setWomen] = useState([])
    async function fetchWomen(url = "http://localhost:8080/women") {
        const response = await fetch(url);
        const json = await response.json();
        setWomen(json)
    }

    useEffect(() => {

        fetchWomen();
    }, [])

    return (
        <>
            <h1>Important Women in Tech History</h1>
            <WomenList women={women} />

        </>
    )
}







export default WomenInTechContainer;