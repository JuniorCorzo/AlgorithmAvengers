import Navbar from '../../components/Navbar'
import CardResources from './components/CardResources';
import './styled-components/resources.scss'

import videoImg from '../../assets/img/resource-videos.jpeg'
import cursosImg from '../../assets/img/resource-cursos.jpeg'
import docsImg from '../../assets/img/resource-docs.jpeg'
import contactosImg from '../../assets/img/resource-contactos.jpeg'

export default function Resources() {
    const data = [
        {
            title: 'Vídeos',
            img: videoImg,
            link: '', 
        },
        {
            title: 'Cursos',
            img: cursosImg,
            link: '',
        },
        {
            title: 'Documentación',
            img: docsImg,
            link: '',
        },
        {
            title: 'Apoyo Psicológico y Contacto',
            img: contactosImg,
            link: '',
        },
    ];

    return (
        <>
            <Navbar />

            <section className='Resources'>
                <div className="container">
                    <h2>Recursos de Apoyo</h2>
                    <CardResources cards={data}/>
                </div>
            </section>
        </>
    )
}
