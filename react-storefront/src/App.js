import React from 'react';
import axios from 'axios';
export default function App(){
  const createOrder = async ()=>{
    const resp = await axios.post('http://localhost:8081/orders', { userId: 'u1', items: [{sku:'SKU-1', qty:1}], total: 9.99 });
    alert('Order created: '+ JSON.stringify(resp.data));
  }
  return (<div style={{padding:20}}>
    <h1>React Storefront (Demo)</h1>
    <button onClick={createOrder}>Place Order</button>
  </div>)
}
