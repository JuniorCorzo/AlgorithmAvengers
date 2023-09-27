import Navbar from '../../components/Navbar'
import CardResources from './components/CardResources';
import './styled-components/resources.scss'

export default function Resources() {
    const resourcesData = [1,2,3,4];

    return (
        <>
            <Navbar />

            <section className='Resources'>
                <div className="container">
                    <h2>Recursos de Apoyo</h2>
                    <div className="row cards">
                        {resourcesData.map((resource) => (
                            <div key={resource} className="col">
                                <CardResources />
                            </div>
                        ))}
                    </div>
                </div>
            </section>
        </>
    )
}
