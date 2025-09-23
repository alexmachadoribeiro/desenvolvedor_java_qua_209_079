const cpfMask = document.querySelector('#cpf');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const form = document.querySelector('form');

const btn = () => {
    let nome = document.querySelector('#nome').value;
    let cpf = document.querySelector('#cpf').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let result = `Nome: ${nome}.<br>
                    CPF: ${cpf}<br>
                    Telefone: ${telefone}<br>
                    CEP: ${cep}.`;

    document.querySelector('#result').innerHTML = result;
}

cpfMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d)/, '$1.$2')
        .replace(/(\d{3})(\d{1,2})$/, '$1-$2');
});

telefoneMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{2})(\d)/, '($1) $2')
        .replace(/(\d{4,5})(\d)/, '$1-$2')
        .replace(/(-\d{4})\d+?$/, '$1');
});

cepMask.addEventListener('input', function() {
    this.value = this.value
        .replace(/\D/g, '')
        .replace(/(\d{5})(\d)/, '$1-$2')
        .replace(/(-\d{3})\d+?$/, '$1');
});

form.addEventListener('submit', function(event) {
    event.preventDefault();
    btn();
});