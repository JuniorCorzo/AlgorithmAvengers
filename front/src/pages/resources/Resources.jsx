import Navbar from '../../components/Navbar'
import CardResources from './components/CardResources';
import './styled-components/resources.scss'

import videoImg from '../../assets/img/resource-videos.jpeg'
import cursosImg from '../../assets/img/resource-cursos.jpeg'
import docsImg from '../../assets/img/resource-docs.jpeg'
import contactosImg from '../../assets/img/resource-contactos.jpeg'
import equipoImg from '../../assets/img/resource-equipo.jpeg'
import useScrollToTop from '../../hooks/useScrollToTop';

export default function Resources() {
    useScrollToTop();

    const data = [
        {
            title: 'Vídeos',
            description: 'Aprende sobre ciencia, tecnología, ingeniería y matemáticas con nuestros vídeos educativos. Desde vídeos introductorios hasta vídeos avanzados, tenemos algo para todos.',
            img: videoImg,
            link: 'https://www.youtube.com', 
        },
        {
            title: 'Cursos',
            description: 'Desarrolla tus habilidades y conocimientos en ciencia, tecnología, ingeniería y matemáticas con nuestros cursos online. Tenemos una amplia selección de cursos gratuitos y de pago para todos los niveles.',
            img: cursosImg,
            link: 'https://platzi.com/cursos/',
        },
        {
            title: 'Documentación',
            description: 'Encuentra documentación técnica y tutoriales sobre ciencia, tecnología, ingeniería y matemáticas. Nuestra colección incluye documentación para lenguajes de programación, frameworks, bibliotecas y más.',
            img: docsImg,
            link: 'https://www.w3schools.com/',
        },
        {
            title: 'Canales de Apoyo',
            description: 'Obtén apoyo psicológico de organizaciones que entienden los desafíos únicos de los estudiantes y profesionales de ciencia, tecnología, ingeniería y matemáticas.',
            img: contactosImg,
            link: 'https://www.stemeducol.com/',
        },
        {
            title: 'Equipo Personalizado de Notion',
            description: 'Organiza tu aprendizaje y trabajo con nuestra plantilla de Notion personalizada para estudiantes y profesionales de ciencia, tecnología, ingeniería y matemáticas.',
            img: equipoImg,
            link: 'https://common-politician-4da.notion.site/Sena-Soft-2023-Algorithms-Avengers-e0e627991ab14102abd3382f1582e342?pvs=4',
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
