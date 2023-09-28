import '../../styled-components/auth.scss'
import loginImage from '../../assets/img/login.jpeg'
import { Link } from 'react-router-dom';
import useScrollToTop from '../../hooks/useScrollToTop';

export default function Login() {
    useScrollToTop();
    
    return (
        <>
            {/* Uso IA para adaptar la plantilla de Login en codigo JSX */}
            <section className="vh-100 Img-side">
                <div className="container py-5 h-100">
                    <div className="row d-flex justify-content-center align-items-center h-100">
                    <div className="col col-xl-10">
                        <div className="card" style={{borderRadius: '1rem'}}>
                        <div className="row g-0">
                            <div className="col-md-6 col-lg-5 d-none d-md-block">
                            <img src={loginImage}
                                alt="login form" className="img-fluid" style={{borderRadius: '1rem 0 0 1rem', height:'100%'}} />
                            </div>
                            <div className="col-md-6 col-lg-7 d-flex align-items-center">
                            <div className="card-body p-4 p-lg-5 text-black">

                                <form>

                                <div className="d-flex align-items-center mb-3 pb-1">
                                    <i className="fas fa-cubes fa-2x me-3" style={{color: '#ff6219'}}>Algorithm Avengers</i>
                                    <span className="h1 fw-bold mb-0">GoSTEM</span>
                                </div>

                                <h5 className="fw-normal mb-3 pb-3">¡Que gusto verte de nuevo!</h5>

                                <div className="form-outline mb-4">
                                    <input type="email" id="form2Example17" className="form-control form-control-lg" />
                                    <label className="form-label" htmlFor="form2Example17">Correo Electrónico</label>
                                </div>

                                <div className="form-outline mb-4">
                                    <input type="password" id="form2Example27" className="form-control form-control-lg" />
                                    <label className="form-label" htmlFor="form2Example27">Contraseña</label>
                                </div>

                                <div className="pt-1 mb-4">
                                    <Link to='/' className='nav-item'>
                                        <button className="btn btn-dark btn-lg btn-block" type="button">Iniciar</button>
                                    </Link>
                                </div>

                                <a className="small text-muted" href="#!">¿Olvidó su Contraseña?</a>
                                <p className="mb-5 pb-lg-2" style={{color: '#393f81'}}>
                                    ¿No tienes Cuenta con Nosotros?  
                                    <Link to='/register' className='nav-item'>
                                        <a href="#!"style={{color: '#393f81'}}>Registrate Aquí</a>
                                    </Link>
                                </p>
                                
                                <a href="#!" className="small text-muted">Términos de Uso. </a>
                                <a href="#!" className="small text-muted">Política de Privacidad</a>
                                </form>

                            </div>
                            </div>
                        </div>
                        </div>
                    </div>
                    </div>
                </div>
            </section>
        </>
    );
}

