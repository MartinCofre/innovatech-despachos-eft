import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { CrudAdmin } from "../componentes/CrudAdmin.jsx";

const AppRoutes = () => {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<CrudAdmin />} />
      </Routes>
    </Router>
  );
};

export default AppRoutes;
