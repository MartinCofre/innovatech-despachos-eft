import React from "react";

export const SearchBar = () => {
  return (
    <>
      <section className="grid grid-cols-1 h-[200px] items-center justify-items-center">
        <div className="flex">
          <form className="flex gap-2">
            <input
              required
              placeholder="Ingresa el n° de orden de compra"
              type="text"
              className="bg-gray-50 border-2 border-gray-300 text-gray-900 text-sm rounded focus:ring-blue-300 focus:border-blue-300 block duration-500 w-[500px] h-[60px] p-2.5 outline-none"
            />
            <button className="px-16 bg-teal-500/80 border rounded-xl font-bold hover:bg-teal-600 transition-all duration-500 text-white">
              Buscar
            </button>
          </form>
        </div>
      </section>
    </>
  );
};
