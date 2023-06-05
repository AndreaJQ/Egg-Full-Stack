import useCounter from "../customHooks/counter";

function Main() {
    
    const {counter,increase,decrease,reset,} = useCounter();

  return (
    <div>
      <h1> Counter Custom Hook </h1>
        <h2> {counter}</h2>
    <button onClick={increase}> + </button>   
    <button onClick={decrease}> - </button>  
    <button onClick={reset}> reset </button>           
    </div>
  )
}

export default Main
