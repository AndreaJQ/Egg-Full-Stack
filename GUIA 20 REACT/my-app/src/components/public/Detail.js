import React, { useEffect, useState } from "react";
import RMService from "../../services/RMservice";
import { Link, useParams, useLocation } from "react-router-dom";



const Detail = () => {

const [character, setCharacter] = useState({});
const {id} = useParams();
const {pathname} =useLocation();

useEffect(() => {
    console.log(pathname);
    RMService.getCharacterById(id)
    .then((data) => setCharacter(data))
  }, []);



    return (
        <div className="card" style={{width: '18rem'}}>
          <img src={character.image} className="card-img-top" alt="imagen" />
          <div className="card-body">
            <h5 className="card-title">{character.name}</h5>
            <p className="card-text">Signos vitales: {character.status}</p>
          </div>
          <ul className="list-group list-group-flush">
            <li className="list-group-item">Especie: {character.species}</li>
            <li className="list-group-item">Genero: {character.gender}</li>
            <li className="list-group-item">Identificador: {character.id}</li>
          </ul>
          <div className="card-body">
            {/* <a href="#" className="card-link">
              Card link
            </a>
            <a href="#" className="card-link">
              Another link
            </a> */}
            <Link to={"/"} className="btn btn-sm btn-outline-secondary">
              Volver al menu principal
            </Link>
          </div>
        </div>
      );
    };

export default Detail
