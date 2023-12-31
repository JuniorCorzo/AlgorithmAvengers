import { Link } from 'react-router-dom'
import '../styled-components/navbar.scss'

export default function Navbar() {
    return (
        <nav className="navbar navbar-expand-md navbar-dark fixed-top Navbar">
            <div className="container-md">
                <Link to='/' className="nav-item">
                    <a className="navbar-brand">
                        GoSTEM
                    </a>
                </Link>
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarNav">
                    <ul className="navbar-nav d-flex gap-5 ms-5">
                        <li className="nav-item">
                            <a className="nav-link active" aria-current="page" href="#">Inicio</a>
                        </li>
                        <Link to='/filter' className="nav-item">
                            <a className="nav-link">Tu Motivo de Deserción</a>
                        </Link>
                        <Link to='/resources' className="nav-item">
                            <a className="nav-link">Recursos de Aprendizaje</a>
                        </Link>
                    </ul>
                </div>
                <div className="d-flex">
                    <Link to='/login' className="nav-item">
                        <a className="nav-link">Iniciar Sesión</a>
                    </Link>
                </div>
            </div>
        </nav>
    )
}
