import Navbar from "../../components/Navbar";
import './styled-components/home.scss'

export default function Home() {
    return (
        <>
            <Navbar />

            <section className="Home">
                <h1>GoSTEM</h1>
                <div className="container">
                    <div className="row justify-content-around">
                        <div className="col-4 col-img">
                            
                        </div>
                        <div className="col col-info">
                            <h4>STEM</h4>
                            <p className="mt-4">Lorem ipsum dolor sit amet consectetur adipisicing elit. Impedit officiis, sit harum reiciendis dolorum sed non accusamus recusandae facere voluptates quae nulla! Autem explicabo quisquam a cupiditate quo sed accusamus.</p>
                        </div>
                    </div>
                </div>
            </section>

        </>
    );
}

