import { Link } from 'react-router-dom'
import './styled-components/filter.scss'

export default function Filter() {
    return (
        <>
            <section className="Formulario">
                <div className="container px-5 my-5">
                <div className="row justify-content-center">
                    <div className="col-lg-8">
                    <div className="card border-0 rounded-3 shadow-lg">
                        <div className="card-body p-4">
                        <div className="text-center">
                            <div className="h1 fw-light">Motivo de Deserción</div>
                            <p className="mb-4 text-muted">¡Comparte tu razón por la que planteas desertar en tú sector STEM, podemos ayudarte!</p>
                        </div>

                        <form id="contactForm" data-sb-form-api-token="API_TOKEN">
                            <div className='mb-3'>
                                <select className="form-select form-select-lg" aria-label="Tipo">
                                    <option selected>Tipo</option>
                                    <option value="1">Dificultad Académica</option>
                                    <option value="2">Problemas Económicos</option>
                                    <option value="3">Falta de Interés o Pasión</option>
                                    <option value="3">Falta de Perspectiva Laboral</option>
                                    <option value="3">Incompatibilidad con Otros Compromisos</option>
                                </select>
                                <div className="invalid-feedback" data-sb-feedback="name:required">Motivo is required.</div>
                            </div>

                            <div className="form-floating mb-3">
                                <textarea className="form-control" id="message" type="text" placeholder="Por qué" style={{height: '10rem'}}></textarea>
                                <label htmlFor="message">Justificación, ¿Por qué planeas desertar?</label>
                                <div className="invalid-feedback" data-sb-feedback="message:required"> is required.</div>
                            </div>

                            {/* <div className="d-none" id="submitSuccessMessage">
                                <div className="text-center mb-3">
                                    <div className="fw-bolder">Form submission successful!</div>
                                    <p>To activate this form, sign up at</p>
                                    <a href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
                                </div>
                            </div>

                            <div className="d-none" id="submitErrorMessage">
                                <div className="text-center text-danger mb-3">Error sending message!</div>
                            </div> */}

                            <div className="d-flex justify-content-center">
                                <Link to='/resources' className='nav-item'>
                                    <button className="btn btn-primary btn-lg" id="submitButton" type="submit">Buscar Solución</button>
                                </Link>
                            </div>
                        </form>

                        </div>
                    </div>
                    </div>
                </div>
                </div>
            </section>
        </>
    )
}
