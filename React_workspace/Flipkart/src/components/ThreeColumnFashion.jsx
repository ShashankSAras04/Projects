import React from "react";
import img1 from './../assets/Images/ThreeColumnFashion/img1.webp'
import img2 from './../assets/Images/ThreeColumnFashion/img2.webp'
import img3 from './../assets/Images/ThreeColumnFashion/img3.webp'
import img4 from './../assets/Images/ThreeColumnFashion/img4.webp'
import img5 from './../assets/Images/ThreeColumnFashion/img5.webp'
import img6 from './../assets/Images/ThreeColumnFashion/img6.webp'
import img7 from './../assets/Images/ThreeColumnFashion/img7.webp'
import img8 from './../assets/Images/ThreeColumnFashion/img8.webp'
import img9 from './../assets/Images/ThreeColumnFashion/img9.webp'

const ThreeColumnFashion = () => {
    return (
        <div className="container-fluid my-4">
            <div className="row g-3">

                <div className="col-md-4">
                    <div className="bg-white p-3">
                        <div className="d-flex justify-content-between align-items-center mb-2">
                            <h5 className="mb-0 fw-bold">Discounts for you</h5>
                            <span className="text-primary">
                               <a href=""> <i className="bi bi-arrow-right-circle-fill" style={{ fontSize: "1.2rem" }}></i></a>
                            </span>

                        </div>
                        <div className="row g-2">
                            <div className="col-6">
                                <div className="border p-2 ">
                                    <a href="#" style={{textDecoration:"None"}}><img src={img1} className="img-fluid hover-lift-img" alt="Shoes" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small text-black" style={{color:"black"}}>Men’s Casual Shoes</div>
                                    <div className="text-success fw-semibold small">Min. 70% Off</div></a>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="border p-2">
                                    <a href="#" style={{textDecoration:"None"}}><img src={img2} className="img-fluid hover-lift-img" alt="Trimmer" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small" style={{color:"black"}}>Trimmers</div>
                                    <div className="text-success fw-semibold small">Min. 50% Off</div></a>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="border p-2">
                                   <a href="" style={{textDecoration:"None"}}><img src={img3} className="img-fluid hover-lift-img" alt="Slippers" style={{width: "2in", height: "2in", objectFit: "contain"  }} />
                                    <div className="small" style={{color:"black"}}>Men’s Slippers</div>
                                    <div className="text-success fw-semibold small">Min. 70% Off</div></a>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="border p-2">
                                    <a href="" style={{textDecoration:"None"}}><img src={img4} className="img-fluid hover-lift-img" alt="Belt" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small" style={{color:"black"}}>Belts</div>
                                    <div className="text-success fw-semibold small">Min. 50% Off</div></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <div className="col-md-4">
                    <div className="bg-white p-3 ">
                        <div className="d-flex justify-content-between align-items-center mb-2">
                            <h5 className="mb-0 fw-bold">Best quality</h5>
                            <span className="text-primary">
                                <a href=""><i className="bi bi-arrow-right-circle-fill" style={{ fontSize: "1.2rem" }}></i></a>
                            </span>

                        </div>
                        <div className="row g-2">
                            <div className="col-6">
                                <div className="border p-2 ">
                                    <a href="" style={{textDecoration:"None"}}><img src={img5} className="img-fluid hover-lift-img" alt="Ethnic" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small" style={{color:"black"}}>Men's Ethnic Sets</div>
                                    <div className="text-success fw-semibold small">Best Picks</div></a>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="border p-2 ">
                                    <a href="" style={{textDecoration:"None"}}><img src={img6} className="img-fluid hover-lift-img" alt="Jacket" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small" style={{color:"black"}}>Men's Jackets</div>
                                    <div className="text-success fw-semibold small">Grab Now</div></a>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="border p-2 ">
                                    <a href="" style={{textDecoration:"None"}}><img src={img7} className="img-fluid hover-lift-img" alt="Laptop Bag" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small"style={{color:"black"}}>Laptop Bags</div>
                                    <div className="text-success fw-semibold small">Hand-picked</div></a>
                                </div>
                            </div>
                            <div className="col-6">
                                <div className="border p-2 ">
                                    <a href="" style={{textDecoration:"None"}}><img src={img8} className="img-fluid hover-lift-img" alt="Kids Ethnic" style={{width: "2in", height: "2in", objectFit: "contain"  }}/>
                                    <div className="small" style={{color:"black"}}>Kids' Ethnic Sets</div>
                                    <div className="text-success fw-semibold small">Explore Now</div></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div className="col-md-4">
                    <div className="overflow-hidden h-100">
                       <a href="#"> <img
                            src={img9}
                            alt="Banner"
                            className="img-fluid w-100 object-fit-cover" style={{ height: "6in", objectFit: "cover"  }}
                        /></a>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default ThreeColumnFashion;
