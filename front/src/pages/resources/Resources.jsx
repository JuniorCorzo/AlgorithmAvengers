import Navbar from '../../components/Navbar'
import CardResources from './components/CardResources';
import './styled-components/resources.scss'

import videoImg from '../../assets/img/resource-videos.jpeg'
import cursosImg from '../../assets/img/resource-cursos.jpeg'
import docsImg from '../../assets/img/resource-docs.jpeg'
import contactosImg from '../../assets/img/resource-contactos.jpeg'
import equipoImg from '../../assets/img/resource-equipo.jpeg'

export default function Resources() {
    const data = [
        {
            title: 'Vídeos',
            description: 'lorem',
            img: videoImg,
            link: '', 
        },
        {
            title: 'Cursos',
            description: 'lorem',
            img: cursosImg,
            link: '',
        },
        {
            title: 'Documentación',
            description: 'lorem',
            img: docsImg,
            link: '',
        },
        {
            title: 'Apoyo Psicológico y Contacto',
            description: 'lorem',
            img: contactosImg,
            link: '',
        },
        {
            title: 'Equipo Personalizado de Notion',
            description: 'lorem',
            img: equipoImg,
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
