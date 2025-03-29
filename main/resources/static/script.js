const animais = [
    {
        nome: "Simba",
        idade: 5,
        tipo: "leao",
        foto: "imagens/leaoMascote.png", // Você precisará adicionar uma pasta 'imagens' com fotos
        som: "audios/leao.mp3"   // Você precisará adicionar uma pasta 'audios' com os sons
    },
    {
        nome: "Dumbo",
        idade: 10,
        tipo: "elefante",
        foto: "imagens/elefanteMascote.png",
        som: "audios/elefante.mp3"
    },
    {
        nome: "Piu-Piu",
        idade: 2,
        tipo: "canario",
        foto: "imagens/passaroMascote.png",
        som: "audios/passaro.mp3"
    }
];

const rowAnimais = document.querySelector('.row');

animais.forEach(animal => {
    const col = document.createElement('div');
    col.classList.add('col-md-4', 'mb-4'); // Colunas médias com margem inferior

    const card = document.createElement('div');
    card.classList.add('card');

    const img = document.createElement('img');
    img.src = animal.foto;
    img.alt = `Foto de ${animal.nome}`;
    img.classList.add('card-img-top');

    const cardBody = document.createElement('div');
    cardBody.classList.add('card-body', 'text-center');

    const nome = document.createElement('h5');
    nome.classList.add('card-title');
    nome.textContent = animal.nome;

    const idade = document.createElement('p');
    idade.classList.add('card-text');
    idade.textContent = `Idade: ${animal.idade} anos`;

    const botaoSom = document.createElement('button');
    botaoSom.classList.add('btn', 'btn-primary');
    botaoSom.textContent = 'Ouvir Som';
    botaoSom.addEventListener('click', () => {
        const audio = new Audio(animal.som);
        audio.play();
    });

    cardBody.appendChild(nome);
    cardBody.appendChild(idade);
    cardBody.appendChild(botaoSom);

    card.appendChild(img);
    card.appendChild(cardBody);

    col.appendChild(card);
    rowAnimais.appendChild(col);
});