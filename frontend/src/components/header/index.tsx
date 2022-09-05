import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo } alt="DSMeta" />
                <h2>DSMeta</h2>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagran.com/desvsuperior.ig">@devsuperior</a>
                </p>
            </div>
        </header>
    )
}

export default Header
