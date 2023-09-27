/* eslint-disable react/prop-types */
import { Link } from "react-router-dom";
import '../styled-components/sectors.scss'

export default function Sectors({sections}) {
    return (
        <>
            <section className="Sectors">
                <div className="container d-flex gap-5 mt-0 flex-column">
                    <h2 className="text-center">Sectores Cubiertos</h2>
                    {sections.map((section, index) => (
                        <div key={index} id={section.title} className="row sector-card">
                            <div className="col-sm-6 px-0">
                                <img
                                    src={section.img}
                                    alt={section.title}
                                    className="sector-card-img"
                                    />
                            </div>
                            <div className="col-sm-6 d-flex flex-column text-center justify-content-evenly">
                                <h3>{section.title}</h3>
                                <p>{section.description}</p>
                                <div className="d-flex flex-row align-items-center justify-content-around">
                                    <ul className="d-flex flex-column gap-3">
                                        {section.areas.map((area, index) => (
                                        <li key={index}>{area}</li>
                                        ))}
                                    </ul>

                                    <Link to={section.link}>
                                        <button className="btn px-4 sector-card-button">
                                            Ver más
                                        </button>
                                    </Link>
                                </div>
                            </div>
                        </div>
                    ))}
                </div>
            </section>
        </>
    )
}
