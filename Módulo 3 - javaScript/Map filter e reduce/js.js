//DESAFIO 1

const maça = {
    value: 2,
}
const laranja = {
    value: 2,
}

function mapComThis(arr, thisArg){
    return arr.map(function(item){
        return item * this.value
    },thisArg)
}

const nums = [1,2,3,4,5]
function mapSemThis(arr){
    return arr.map(function(item){
        return item * 2
    })
}

console.log(mapSemThis(nums))

//DESAFIO 2

const arr2 = ['Carro Conversível','Carro SedãCarro hatch','Ferrari(rebaixado)', 'Corsa(rebaixado)']

function filter(arr){
    return arr.filter(function(item){
        return item.includes('Carro')
    })
}

console.log(filter(arr2))

//DESAFIO 3

function meuReduce(arr){
    return arr.reduce(function(prev, current){
        console.log({prev})
        console.log({current})
        return prev + current
    }, 0)
}

const nums2 = [1,2] 
console.log(meuReduce(nums2))

// reduce { prev: 0 }{ current: 1 }{ prev: 1 }{ current: 2 }3


const lista = [
    {
        name: 'mortadela',
        preco: 15,
    },
    {
        name: 'Monster',
        preco: 10,
    },
    {
        name: 'Chocolate',
        preco: 15,
    }

]

const saldoDisponivel = 100;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(prev, current, index){ 
        console.log('Rodada', index + 1)
        console.log({prev})
        console.log({current})
        return prev - current.preco
    },saldoDisponivel)
}

console.log(calculaSaldo(saldoDisponivel, lista))



// isso aqui subtrai o saldo anterior que começou com o saldoDisponivel e subtraia o prev q é o anterior menos o atual 
// Anterior começa com 100(saldo), e o atual que é o que ja subtraiu ou nao