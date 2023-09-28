import './styled-components/home.scss'

import Navbar from "../../components/Navbar";
import SectorsNav from "./components/SectorsNav";
import Sectors from "./components/Sectors";

import homeImg from '../../assets/img/home.jpeg'
import cienciaImg from '../../assets/img/ciencia.jpeg'
import tecnologiaImg from '../../assets/img/tecnologia.jpeg'
import ingenieriaImg from '../../assets/img/ingenieria.jpeg'
import matematicasImg from '../../assets/img/matematicas.jpeg'
import useScrollToTop from '../../hooks/useScrollToTop';
import ArrowToTop from '../../components/ArrowToTop';

// import { RestTemplate } from 'spring-web-client';

export default function Home() {
    useScrollToTop();

    // // Create a RestTemplate instance
    // const restTemplate = new RestTemplate();

    // // Configure the GET request to the /sectors endpoint
    // const url = "http://localhost:8080/sectors?q={q}";

    // // Make the request and get the response
    // const response = restTemplate.getForEntity(url, List.class);

    // // Get the list of sectors from the response
    // const sectors = response.getBody();

    // // Get the search query from the URL
    // const q = new URLSearchParams(window.location.search).get('q');

    const data = [
        {
            title: 'Ciencia',
            description: 'Explora el apasionante mundo de la ciencia, donde la curiosidad y la investigación son clave. Descubre los avances científicos que están transformando nuestro conocimiento del mundo que nos rodea.',
            img: cienciaImg,
            areas: ['Física', 'Química', 'Astronomía', 'Geología']
        },
        {
            title: 'Tecnología',
            description: 'Sumérgete en el mundo de la tecnología, donde la innovación y la creatividad convergen para dar forma al futuro. Explora las últimas tendencias tecnológicas y sus aplicaciones prácticas.',
            img: tecnologiaImg,
            areas: ['Informática', 'Telecomunicaciones', 'Desarrollo de Software', 'Ciberseguridad']
        },
        {
            title: 'Ingeniería',
            description: 'Descubre el emocionante campo de la ingeniería, donde la resolución de problemas y el diseño son fundamentales. Explora cómo los ingenieros crean soluciones para desafíos globales.',
            img: ingenieriaImg,
            areas: ['Mecánica', 'Civil', 'Industrial', 'Electrónica']
        },
        {
            title: 'Matemáticas',
            description: 'Adéntrate en el mundo de las matemáticas, el lenguaje universal de la ciencia. Descubre cómo las matemáticas están en el corazón de todos los aspectos de la vida y la investigación.',
            img: matematicasImg,
            areas: ['Álgebra', 'Geomtería', 'Cálculo', 'Aritmética']
        },
    ];

    return (
        <>
            <Navbar />
            <SectorsNav name={'Sectores'} sections={data} />

            <section className="Home">
                <h1>GoSTEM</h1>
                <div className="container">
                    <div className="row justify-content-around">
                        <div className="col-md-6 col-sm-12">
                            <img src={homeImg} alt="" className="col-img" />
                        </div>
                        <div className="col-md-6 col-sm-12 col-info">
                            <h3 className="mt-5">Ciencia, Tecnología, Ingeniería, y Matemáticas</h3>
                            <p className="mt-5">
                                Bienvenido a GoSTEM, donde exploramos el apasionante mundo de la Ciencia, la Tecnología,
                                la Ingeniería y las Matemáticas. Nuestro objetivo es inspirar la curiosidad y el
                                descubrimiento en estos campos fundamentales que impulsan la innovación y dan forma al futuro.
                            </p>
                        </div>
                    </div>
                </div>
            </section>

            <ArrowToTop />
            <Sectors sections={data}/>
        </>
    );
}

