import React from "react";
import logo1 from "../../assets/images/logo2.png";

function Footer() {
  return (
    <footer className="bg-teal-500 p-4 text-center w-full rounded-xl">
      <div className="mx-auto w-full max-w-screen-xl p-4 py-6 lg:py-8">
        <div className="md:flex md:justify-between">
          <div className="mb-6 md:mb-0">
            <a href="#" className="flex items-center">
              <div className="flex justify-center mb-4">
                <img src={logo1} alt="Logo" className="w-20 h-20" />
              </div>
            </a>
          </div>
          <div className="grid grid-cols-2 gap-8 sm:gap-6 sm:grid-cols-3">
            <div>
              <h2 className="mb-6 text-sm font-semibold text-white uppercase dark:text-white">
                Condiciones servicio
              </h2>
              <ul className="text-white font-medium">
                <li className="mb-4">
                  <a href="#" className="hover:underline">
                    Recomendaciones embalaje
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:underline">
                    Cobertura
                  </a>
                </li>
              </ul>
            </div>
            <div>
              <h2 className="mb-6 text-sm font-semibold  uppercase dark:text-white">
                Siguenos
              </h2>
              <ul className=" text-white">
                <li className="mb-4">
                  <a href="#" className="hover:underline ">
                    Instagram
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:underline">
                    Facebook
                  </a>
                </li>
              </ul>
            </div>
            <div>
              <h2 className="mb-6 text-sm font-semibold text-white uppercase dark:text-white">
                Legal
              </h2>
              <ul className="text-white">
                <li className="mb-4">
                  <a href="#" className="hover:underline">
                    Condiciones de privacidad
                  </a>
                </li>
                <li>
                  <a href="#" className="hover:underline">
                    Terminos &amp; Condiciones
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <hr className="my-6 border-gray-200 sm:mx-auto dark:border-gray-700 lg:my-8" />
        <div className="sm:flex sm:items-center sm:justify-between">
          <span className="text-sm text-gray-800 dark:text-gray-800 sm:text-center">
            © 2024{" "}
            <a href="#" className="hover:underline">
              ITPCARGO™
            </a>
            . Todos los derechos reservados.
          </span>
        </div>
      </div>
    </footer>
  );
}

export default Footer;
