import Navbar from '../../components/Navbar'
import CardResources from './components/CardResources';
import './styled-components/resources.scss'

export default function Resources() {
    const data = [
        {
            title: 'Ciencia',
        },
        {
            title: 'Tecnología',
        },
        {
            title: 'Ingeniería',
        },
        {
            title: 'Matemáticas',
        },
    ];
    return (
        <>
            <Navbar />

            <section className='Resources'>
                <div className="container">
                    <h2>Recursos de Apoyo</h2>
                    <div className="row cards d-flex gap-5 justify-content-center">
                        {data.map((resource) => (
                            <div key={resource} className="col-md-3 col-sm-4 d-flex flex-wrap">
                                <CardResources />
                            </div>
                        ))}
                    </div>
                </div>
            </section>
        </>
    )
}
