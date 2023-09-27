/* eslint-disable react/prop-types */
/* eslint-disable react/jsx-no-comment-textnodes */
import '../styled-components/sectorsNav.scss';

// eslint-disable-next-line react/prop-types
export default function Sectors({name, sections}) {
    // Función para desplazar la página hacia la sección del botón clickeado 
    const scrollToSection = (id) => {
        const element = document.getElementById(id);
        if (element) {
            element.scrollIntoView({ behavior: 'smooth' });
        }
    };

    return (
        <div className='Sectors'>
            <h4>{name}</h4>
            
            <div className='links'>
                {sections.map((section, index) => (
                    <button
                        key={index}
                        onClick={() => scrollToSection(section.title)}
                    >
                        {section.title}
                    </button>
                ))}
            </div>
        </div>
    )
}
