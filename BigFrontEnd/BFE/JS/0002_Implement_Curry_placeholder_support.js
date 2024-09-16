function curry(fn) {
    // your code here
    return function curried(...args){
      let expectedArgs = fn.length
      let isArgsEnough = args.length >= expectedArgs && args.slice(0, expectedArgs).every(arg => arg !== curry.placeholder);
  
      if(isArgsEnough){
        return fn.apply(this, args)
      }
      else {
        return function(...newArgs){
          let finalArgs = []
          let i = 0;
          let j = 0;
  
          while(i < args.length && j < newArgs.length){
            if(args[i] === curry.placeholder){
              finalArgs.push(newArgs[j])
              i+=1
              j+=1
            }
            else {
              finalArgs.push(args[i]);
              i+=1
            }          
          }
  
          while (i < args.length ){
            finalArgs.push(args[i])
            i+=1;
          }
  
          while (j < newArgs.length){
            finalArgs.push(newArgs[j])
            j+=1;
          }
  
          return curried(...finalArgs)
        }
      }
  
    }
  }