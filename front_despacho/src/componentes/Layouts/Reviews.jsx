function Reviews() {
  return (
    <div className="bg-white  sm:py-10">
      <div className="mx-auto text-center ">
        <h2 className="text-center text-lg font-semibold leading-8 text-gray-900">
          Empresas que confían en nosotros
        </h2>
        <div className="mx-auto mt-10 grid max-w-lg grid-cols-4 items-center gap-x-8 gap-y-10 sm:max-w-xl sm:grid-cols-6 sm:gap-x-10 lg:mx-0 lg:max-w-none lg:grid-cols-3">
          <img
            className="col-span-2 max-h-12 w-full object-contain lg:col-span-1 mx-auto"
            src="https://seeklogo.com/images/A/apple-logo-E3DBF3AE34-seeklogo.com.png"
            alt="Transistor"
            width="158"
            height="48"
          />

          <img
            className="col-span-2 max-h-12 w-full object-contain lg:col-span-1 mx-auto"
            src="https://seeklogo.com/images/H/hyper-x-logo-C4B6774A38-seeklogo.com.png"
            alt="Tuple"
            width="158"
            height="48"
          />
          <img
            className="col-span-2 max-h-12 w-full object-contain sm:col-start-2 lg:col-span-1 mx-auto"
            src="https://seeklogo.com/images/L/logitech-gaming-logo-B76FC713B0-seeklogo.com.png"
            alt="SavvyCal"
            width="158"
            height="48"
          />
        </div>
      </div>
    </div>
  );
}

export default Reviews;
