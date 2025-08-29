import React, { useEffect, useState } from 'react'

const api_url="https://fakestoreapi.com/products"
const Fakestoreproducts_api = () => {
        const[productname,getproducts]=useState([])
        async function setproducts() {
            const response = await fetch(api_url)
            const all_products=await response.json()
            console.log(all_products)
            getproducts(all_products)
            
        }
        useEffect(()=>{
            setproducts()
        },[productname])

  return (
    <div>
       {
        productname.map((prod)=>{
            return(
                <div>
                    <fieldset>
                        <legend>Products</legend>
                    <h2>Product Name : {prod.title} <br /></h2>
                    <h2>Product Price : {prod.price} <br /></h2>
                    <h2>Product Description : {prod.description} <br /></h2>
                    <h2>Product category : {prod.category}</h2>
                    <img src={prod.image} alt="" style={{height:"1in",width:"1in"}} />
                    
             
                </fieldset>
                </div>
                
                
            )


        })
       }
    </div>
  )
}

export default Fakestoreproducts_api