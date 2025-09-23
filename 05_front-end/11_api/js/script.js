// variáveis globais
const btn = document.querySelector('form');
const telefoneMask = document.querySelector('#telefone');
const cepMask = document.querySelector('#cep');
const pesquisaCep = document.querySelector('#cep');

// arrow functions
const limpa_formulario_cep = () => {
    // limpa valores do formulário
    document.querySelector('#estado').value = ("");
    document.querySelector('#cidade').value = ("");
    document.querySelector('#bairro').value = ("");
    document.querySelector('#logradouro').value = ("");
}

const meu_callback = (conteudo) => {
    if (!("erro" in conteudo)) {
        document.querySelector('#estado').value = (conteudo.uf);
        document.querySelector('#cidade').value = (conteudo.localidade);
        document.querySelector('#bairro').value = (conteudo.bairro);
        document.querySelector('#logradouro').value = (conteudo.logradouro);
    }
    else {
        // CEP não encontrado
        limpa_formulario_cep();
        alert("CEP não encontrado.");
    }
}

// eventos
pesquisaCep.addEventListener('blur', function() {
    // cep somente com dígitos
    let cep = document.querySelector('#cep').value.replace(/\D/g, '');

    // cep tem valor informado
    if (cep != "") {
        // variavel de validação do CEP
        let validarCep = /^[0-9]{8}$/;

        // valida o cep
        if (validarCep.test(cep)) {
            document.querySelector('#estado').value = "...";
            document.querySelector('#cidade').value = "...";
            document.querySelector('#bairro').value = "...";
            document.querySelector('#logradouro').value = "...";

            // cria um elemento js
            let script = document.createElement('script');

            // sincroniza o callback
            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meu_callback';

            // insere o script no documento e carrega o conteúdo
            document.body.appendChild(script);
        }
        else {
            limpa_formulario_cep();
            alert("Formato do CEP inválido.")
        }
    }
    else {
        // limpa formulário
        limpa_formulario_cep();
    }
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

btn.addEventListener('submit', function(event) {
    event.preventDefault();

    let nome = document.querySelector('#nome').value;
    let telefone = document.querySelector('#telefone').value;
    let cep = document.querySelector('#cep').value;
    let estado = document.querySelector('#estado').value;
    let cidade = document.querySelector('#cidade').value;
    let bairro = document.querySelector('#bairro').value;
    let logradouro = document.querySelector('#logradouro').value;
    let complemento = document.querySelector('#complemento').value;
    let numero = document.querySelector('#numero').value;
    let dados = `Dados do usuário:<br><br>
                Nome: ${nome}<br>
                Telefone: ${telefone}<br>
                CEP: ${cep}<br>
                Estado: ${estado}<br>
                Cidade: ${cidade}<br>
                Bairro: ${bairro}<br>
                Logradouro: ${logradouro}<br>
                Complemento: ${complemento}<br>
                Número: ${numero}<br>
                `;
    
    document.querySelector('#dados').innerHTML = dados;
});