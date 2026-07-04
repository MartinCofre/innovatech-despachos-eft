import Navbar from "./Layouts/Navbar";
import Footer from "./Layouts/Footer";

import { PruebaCards } from "./CrudAdmin/PruebaCards";
import Reviews from "./Layouts/Reviews";

export const CrudAdmin = () => {
  return (
    <>
      <div className="grid grid-cols-[auto_1fr] min-h-screen bg-gray-50">
        <div className="col-span-1">
          {/* Columna 1: Navbar (ancho fijo) */}
          <Navbar />
        </div>

        {/* Columna 2: Contenido principal (ocupa el espacio restante) */}
        <div className="overflow-y-auto p-6">
          {" "}
          {/* Por si el contenido es muy largo */}
          <PruebaCards />
          <Reviews />
          <Footer />
        </div>
      </div>
    </>
  );
};
