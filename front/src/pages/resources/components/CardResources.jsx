/* eslint-disable react/jsx-key */
/* eslint-disable react/prop-types */
import '../styled-components/card-resources.scss'

export default function CardResources({cards}) {
    return (
        <>
            <div className="row cards d-flex gap-5 justify-content-center">
                {cards.map((resource) => (
                    <div className="cardT px-3">
                            <img src={resource.img} alt=""/>
                        <div key={resource} className="col-md-3 col-sm-4 d-flex flex-wrap">
                            <div className="card__content">
                                <p className="card__title">{resource.title}</p>
                                <p className="card__description">{resource.description}</p>
                                <a className='card__link nav-link' href={resource.link}>Ir</a>
                            </div>
                        </div>
                    </div>        
                ))}
            </div>
        </>
    )
}

