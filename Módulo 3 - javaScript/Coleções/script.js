async function resolvePromise(){
    const myPromisse = new Promise((resolve, reject)=>{
      window.setTimeout(()=>{
        console.log('resolvido')
      },3000);
    });

    const resolved = await myPromisse
    .then((result) => result + 'passando pelo then')
    .then((result) => result + 'e agora acabou!')
    .catch((error) => console.log(err.message))
  
  return resolved;
  
  }
  
  