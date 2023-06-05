import React, { useEffect, useState } from "react";
import Card from "./Card";
import RMservice from "../../services/RMservice";

function Cards( {}) {
    
    const [characters, setCharacters]= useState([])
    
    useEffect ( () => {
        // listening - useEffect communicates with the service to get the information
        RMservice.getAllCharacters()
        .then ( (data) => setCharacters(data.results))
        .catch ((error) => console.log(error))
    }, [characters])


    const cardList = characters.map((c) => <Card character = {c} key={c.id}/>)   
	return (
		<div className="album py-5 bg-body-tertiary">
			<div className="container">
				<div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
				{cardList}
				</div>
			</div>
		</div>
	);
}

export default Cards;
