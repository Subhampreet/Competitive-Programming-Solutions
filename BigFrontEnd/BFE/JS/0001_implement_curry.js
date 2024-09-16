function curry(fn) {
    // your code here
    return function curried(...args){
      if(args.length >= fn.length){
        return fn.apply(this, args)
      } else{
        return curried.bind(this, ...args)
      }
    }
  }