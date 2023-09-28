import './styled-components/home.scss'

import Navbar from "../../components/Navbar";
import SectorsNav from "./components/SectorsNav";
import Sectors from "./components/Sectors";

import homeImg from '../../assets/img/home.jpeg'
import cienciaImg from '../../assets/img/ciencia.jpeg'
import tecnologiaImg from '../../assets/img/tecnologia.jpeg'
import ingenieriaImg from '../../assets/img/ingenieria.jpeg'
import matematicasImg from '../../assets/img/matematicas.jpeg'

export default function Home() {
    const data = [
        {
            title: 'Ciencia',
            description: 'lorem',
            img: cienciaImg,
            areas: ['Area 1', 'Area 2', 'Area 3', 'Area 4']
        },
        {
            title: 'Tecnología',
            description: 'lorem',
            img: tecnologiaImg,
            areas: ['Area 1', 'Area 2', 'Area 3', 'Area 4']
        },
        {
            title: 'Ingeniería',
            description: 'lorem',
            img: ingenieriaImg,
            areas: ['Area 1', 'Area 2', 'Area 3', 'Area 4']
        },
        {
            title: 'Matemáticas',
            description: 'lorem',
            img: matematicasImg,
            areas: ['Area 1', 'Area 2', 'Area 3', 'Area 4']
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
                            <p className="mt-5">Lorem ipsum dolor sit amet consectetur adipisicing elit. Impedit officiis, sit harum reiciendis dolorum sed non accusamus recusandae facere voluptates quae nulla! Autem explicabo quisquam a cupiditate quo sed accusamus.</p>
                        </div>
                    </div>
                </div>
            </section>

            <Sectors sections={data}/>
        </>
    );
}

