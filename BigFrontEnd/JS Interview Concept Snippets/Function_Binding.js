// bind - pollyfill using apply()
Function.prototype.bindUsingApply = function (ctx, ...args) {
    let fn = this;
  
    let allArgs = args;
  
    return function (...newArgs) {
      allArgs = [...allArgs, ...newArgs];
      return fn.apply(ctx, allArgs);
    };
  };
  
  // bind - polyfill without using apply()
  Function.prototype.bindWithoutUsingApply = function(ctx, ...args){
    ctx.callableFn = this;
  
    let allArgs = args;
  
    return function (...newArgs) {
      allArgs = [...allArgs, ...newArgs];
      return ctx.callableFn(allArgs);
    };
  }
  
  let myName1 = printname.bindUsingApply(user, "123");
  let myName = printname.bindWithoutUsingApply(user, "mohanty");
  
  myName();
  myName1();
  
  // function print() {
  //   console.log(this.firstname);
  // }
  
  // let myFunc = print.bind(user);
  
  // myFunc();