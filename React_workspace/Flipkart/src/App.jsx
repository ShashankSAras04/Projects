import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';

import CarouselBanner from './components/CarouselBanner'
import BestDeals from './components/BestDeals'
import CategoryMenu from './components/CategoryMenu'
import FeaturedBrands from './components/FeaturedBrands'
import FlipkartHeader from './components/FlipkartHeader'
import Footer from './components/Footer'
import PromoGrid from './components/PromoGrid'
import ThreeColumnFashion from './components/ThreeColumnFashion'
import FlipkartInfoSection from './components/FlipkartInfoSection'
import ElectronicsDeals from './components/ElectronicsDeals';
import Appliances from './components/Appliances';

function App() {


  return (
    <>

    <FlipkartHeader/>
    <CategoryMenu/>
    <CarouselBanner/>
    <BestDeals/>
    <PromoGrid/>
    <FeaturedBrands/>
    <Appliances/>
    <ThreeColumnFashion/>
    <ElectronicsDeals/>
    <FlipkartInfoSection/>
    <Footer/>
    </>
  )
}

export default App
