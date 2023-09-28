import { AiFillUpCircle } from 'react-icons/ai';
import '../styled-components/arrowToTop.scss';

export default function ArrowToTop() {
    const scrollToTop = () => {
        window.scrollTo({
            top: 0,
        });
    };

    return (
        <div className='Arrow' onClick={scrollToTop}>
            <AiFillUpCircle className='arrow-icon'/>
        </div>
    );
}
