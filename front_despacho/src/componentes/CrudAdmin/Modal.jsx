import React from "react";

export const Modal = ({ open, onClose, children }) => {
  return (
    <div
      className={`fixed inset-0 z-10 flex justify-center items-center ${
        open ? "visible bg-black/50 " : "invisible"
      }`}
    >
      <div
        onClick={(e) => {
          e.stopPropagation;
        }}
        className={`flex flex-col items-end bg-white  transition-all rounded-lg ${
          open ? "scale-90 opacity-100" : "scale-100 opacity-0"
        }`}
      >
        <button
          type="button"
          onClick={onClose}
          className="z-20 -mb-6 fill-emerald-500 hover:fill-emerald-600  font-bold hover:text-4xl text-3xl bg-teal-600 text-white transition-all w-14 h-14 "
        >
          X
        </button>
        {children}
      </div>
    </div>
  );
};
