import Navbar from "../../components/Navbar";
import './styled-components/home.scss'
import homeImg from '../../assets/img/home.jpeg'

export default function Home() {
    return (
        <>
            <Navbar />

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

        </>
    );
}

